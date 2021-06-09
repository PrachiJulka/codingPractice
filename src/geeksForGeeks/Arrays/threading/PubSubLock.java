package geeksForGeeks.Arrays.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PubSubLock {



    private volatile List<Integer> arr = new ArrayList<>();
    private Lock lock=new ReentrantLock();
    private Condition pub=lock.newCondition();
    private Condition sub=lock.newCondition();


    void publish(int val, String threadName) {
        lock.lock();
        while (true) {
            while (arr.size() == 10) {
                try {

                    pub.await();
                } catch (InterruptedException i) {

                }
            }
            System.out.println("qq"+threadName);
            arr.add(val);
            sub.signalAll();
        }
    }

     void subscribe(String threadName) {
        while (true) {
            while (arr.size() == 0) {
                try {
                    sub.await();
                } catch (InterruptedException e) {

                }
            }
            System.out.println("aaa" + arr.get(arr.size() - 1) +threadName);
            arr.remove(arr.size() - 1);
            pub.signalAll();

        }
    }

    public static void main(String[] args) {
        PubSub pubSub=new PubSub();
//        Thread thread1=new Thread(new PubRunn(false,pubSub,"thread sub"));
//
//        Thread thread=new Thread(new PubRunn(true,pubSub,1,"thread pub"));
//
//        thread.start();
//        thread1.start();

        //System.out.println(Runtime.getRuntime().availableProcessors());
        for (int  i=0;i<10;i++) {
            Thread thread1=new Thread(new PubRunnLock(false,pubSub,"thread sub"+i));

            Thread thread=new Thread(new PubRunnLock(true,pubSub,1,"thread pub"+i));

            thread.start();
            thread1.start();

        }
    }

}

class PubRunnLock implements Runnable {

    private boolean pub;
    private PubSub pubSub;
    private int val;
    private String threadName;

    public PubRunnLock(boolean pub, PubSub pubSub, int val,String threadName) {
        this.pub = pub;
        this.pubSub = pubSub;
        this.val = val;
        this.threadName=threadName;
    }

    public PubRunnLock(boolean pub, PubSub pubSub, String threadName) {
        this.pub = pub;
        this.pubSub = pubSub;
        this.threadName=threadName;
    }

    @Override
    public void run() {
        if (pub) {
            pubSub.publish(val,threadName);
        } else {
            pubSub.subscribe(threadName);
        }
    }
}



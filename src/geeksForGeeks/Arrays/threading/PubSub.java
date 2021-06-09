package geeksForGeeks.Arrays.threading;

import java.util.ArrayList;
import java.util.List;

public class PubSub {

    private volatile List<Integer> arr = new ArrayList<>();


    synchronized void publish(int val, String threadName) {
        while (true) {
            while (arr.size() == 10) {
               try {

                    wait();
                } catch (InterruptedException i) {

                }
            }
            System.out.println("qq"+threadName);

            arr.add(val);
                notifyAll();

        }
    }

    synchronized void subscribe(String threadName) {
        while (true) {
            while (arr.size() == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {

                }
            }
                System.out.println("aaa" + arr.get(arr.size() - 1) +threadName);
                arr.remove(arr.size() - 1);
                notifyAll();

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
            Thread thread1=new Thread(new PubRunn(false,pubSub,"thread sub"+i));

            Thread thread=new Thread(new PubRunn(true,pubSub,1,"thread pub"+i));

            thread.start();
            thread1.start();

        }
    }

}

class PubRunn implements Runnable {

    private boolean pub;
    private PubSub pubSub;
    private int val;
    private String threadName;

    public PubRunn(boolean pub, PubSub pubSub, int val,String threadName) {
        this.pub = pub;
        this.pubSub = pubSub;
        this.val = val;
        this.threadName=threadName;
    }

    public PubRunn(boolean pub, PubSub pubSub, String threadName) {
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

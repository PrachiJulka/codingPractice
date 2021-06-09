package geeksForGeeks.Arrays.threading;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class PubSubWithBlockingQueue {


    public void pub(int val, BlockingQueue blockingQueue) {
        try {
            while (true) {

                blockingQueue.put(val);
                System.out.println("pub"+blockingQueue.size());

            }
        } catch (InterruptedException e) {

        }

    }

    public void sub(BlockingQueue blockingQueue) {
        try{
            while (true){
                blockingQueue.take();
                System.out.println("sub"+blockingQueue.size());
            }
        }
        catch (InterruptedException e){

        }
    }

    public static void main(String[] args) {
        BlockingQueue blockingQueue=new LinkedBlockingDeque(10);
        PubSubWithBlockingQueue pubSubWithBlockingQueue=new PubSubWithBlockingQueue();

        for (int i=0;i<10;i++){
            Thread t1 = new Thread(new PubSub1(blockingQueue,true,pubSubWithBlockingQueue));
            Thread t2=new Thread(new PubSub1(blockingQueue,false,pubSubWithBlockingQueue));
            t1.start();
            t2.start();
        }

        try {

            Thread.sleep(1000 *10);

        }
        catch (InterruptedException e){

        }
        System.exit(0);
    }
}

class PubSub1 implements Runnable {

    private BlockingQueue blockingQueue;
    private boolean isPub;
    private PubSubWithBlockingQueue pubSubWithBlockingQueue;

    public PubSub1(BlockingQueue blockingQueue, boolean isPub, PubSubWithBlockingQueue pubSubWithBlockingQueue) {
        this.blockingQueue = blockingQueue;
        this.isPub = isPub;
        this.pubSubWithBlockingQueue = pubSubWithBlockingQueue;
    }

    @Override
    public void run() {
        if (isPub) {
        pubSubWithBlockingQueue.pub(1,blockingQueue);
        } else {
        pubSubWithBlockingQueue.sub(blockingQueue);

        }

    }
}



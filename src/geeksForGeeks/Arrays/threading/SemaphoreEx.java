package geeksForGeeks.Arrays.threading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {

        private static Semaphore semaphore=new Semaphore(3);

    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<100;i++) {
            Thread t = new Thread(new R());
            t.start();
        }
    }
    static class R implements Runnable{
        @Override
        public void run() {

                semaphore.tryAcquire();
                System.out.println("dcnjdfnjfvnjf");
                semaphore.release();

        }
    }

}


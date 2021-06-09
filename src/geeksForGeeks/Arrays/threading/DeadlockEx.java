package geeksForGeeks.Arrays.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockEx {

    private Lock lock=new ReentrantLock();
    private Lock lock1=new ReentrantLock();

    public void acquireLock(){
       while (true) {
           try {
               wait();
           } catch (InterruptedException ie) {
               ie.printStackTrace();
           }
           notify();
       }

    }

    public void releaseLock(){
        while (true) {
            try {
                wait();
            } catch (InterruptedException ir) {
                ir.printStackTrace();
            }
            notify();
        }
    }

    public static void main(String[] args) {
        DeadlockEx deadlockEx=new DeadlockEx();
        Thread thread=new Thread(new Run(deadlockEx,true));
        Thread thread1=new Thread(new Run(deadlockEx,false));
        thread.start();
        thread1.start();
    }

}

class Run implements Runnable{

    private DeadlockEx deadlockEx;
    private boolean is;
    public Run(DeadlockEx deadlockEx, boolean is) {
        this.deadlockEx = deadlockEx;
        this.is=is;
    }

    @Override
    public void run() {
        if(is)
        deadlockEx.acquireLock();
        else
        deadlockEx.releaseLock();
    }
}
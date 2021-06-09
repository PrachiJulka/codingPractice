package geeksForGeeks.Arrays.thread;



public class ThreadBasic{

    public static void main(String[] args) {
        ThreadImpl threadImpl=new ThreadImpl();
        Thread thread=new Thread(threadImpl);
        thread.start();
        Thread thread1=new Thread(new ThreadImpl());
        Thread thread2=new Thread(new ThreadImpl());
        thread1.start();
        thread2.start();
    }


}

class ThreadImpl implements Runnable {
    @Override
    public void run() {
       // int sum0;
        for (int i=1;i<=100;i++){
            if(i%10>0){
                System.out.println("remainder number"+i);
            }
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("exception"+e.getMessage());
            }
            System.out.println("Thread started"+Thread.currentThread().getName());
        }
        System.out.println("Thread started"+Thread.currentThread().getName());
    }
}




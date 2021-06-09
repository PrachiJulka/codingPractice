package geeksForGeeks.Arrays.threading;

public class EvenOdd1 {

    volatile int counter=1;
    void evenPrint(){
        for (int i=1;i<10;i++) {
            synchronized (this) {
                while (counter % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
                System.out.println("Even" + counter);
                ++counter;
                notify();
            }
        }
    }

    void oddPrint(){
        for(int i=counter;i<10;i++){
        synchronized (this){
            while (counter%2==0){
                try{
                    wait();
                }
                catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }

            System.out.println("Odd"+counter);
            ++counter;
            notify();
        }
        }
    }

    public static void main(String[] args) {
        EvenOdd1 evenOdd=new EvenOdd1();
        Thread t1=new Thread(()->evenOdd.evenPrint());
        Thread t2=new Thread(()->evenOdd.oddPrint());
        t1.start();
        t2.start();
    }
}

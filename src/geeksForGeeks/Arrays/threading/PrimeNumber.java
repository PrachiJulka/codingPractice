package geeksForGeeks.Arrays.threading;
//
//2. Print Prime and non-prime numbers from 1 to 20 in ascending order using two threads;

public class PrimeNumber {

    private volatile boolean isDone;

    synchronized void printPrime() {
        boolean flag = false;
           for(int i=1;i<=20;i++) {
               flag=false;
               while (isDone) {

                   try {
                       wait();
                   } catch (InterruptedException e) {
                       // interrupt();
                       System.out.println(e);
                   }
               }
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = true;
                }

            }
            if (!flag) {
                System.out.println("Prime : " + i);

            }
            isDone = true;
            notify();
            }



    }

    synchronized void printNonPrime() {
        //  boolean flag=false;
            for (int i = 1; i <= 20; i++) {

                while (!isDone) {

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // interrupt();
                        System.out.println(e);
                    }
                }

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        System.out.println("Non Prime : " + i);
                        break;
                    }

                }

                isDone = false;
                notify();
            }


    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        Thread t1 = new Thread(new PrimeRunnable(20, primeNumber, true));
        Thread t2 = new Thread(new PrimeRunnable(20, primeNumber, false));
        t1.start();
        t2.start();
    }


}


class PrimeRunnable implements Runnable {

    private int max;
    private PrimeNumber primeNumber;
    boolean isPrime;

    public PrimeRunnable(int max, PrimeNumber primeNumber, boolean isPrime) {
        this.max = max;
        this.primeNumber = primeNumber;
        this.isPrime = isPrime;
    }

    @Override
    public void run() {
            if (isPrime)
                primeNumber.printPrime();
            else
                primeNumber.printNonPrime();


        }


}

package geeksForGeeks.Arrays.threading;

public class Example1 {

    public static synchronized void m1(){
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException i){
            i.printStackTrace();
        }
        System.out.println("dd");
    }
    public synchronized void m2(){
        System.out.println("dd1");
    }


    public static void main(String[] args) {
        Example1 example1=new Example1();
        Thread t1=new Thread(()->example1.m1());
        Thread t2=new Thread(()->example1.m2());
        t1.start();
        t2.start();
    }
}

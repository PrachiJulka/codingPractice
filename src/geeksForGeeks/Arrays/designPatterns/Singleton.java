package geeksForGeeks.Arrays.designPatterns;

public class Singleton {

    private static  Singleton INSTANCE;
    static int num;

    private Singleton(){}

    private static Singleton getInstance(){
        if (INSTANCE==null){
          //  num=num1;
           // System.out.println("hey");
            synchronized(Singleton.class){
                if(INSTANCE==null) {
                    INSTANCE = new Singleton();
                }
            }
        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                    System.out.println(Singleton.getInstance());
            }

        });
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                    System.out.println(Singleton.getInstance());
            }

        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                    System.out.println(Singleton.getInstance());
            }

        });
        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                    System.out.println(Singleton.getInstance());
            }

        });
        Thread thread4 = new Thread(new Runnable() {
            public void run() {
                    System.out.println(Singleton.getInstance());
            }

        });
        thread.setPriority(1);

        thread1.setPriority(1);
        thread1.setPriority(1);
        thread1.setPriority(1);
        thread1.setPriority(1);
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }


}

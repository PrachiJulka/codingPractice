package geeksForGeeks.Arrays.thread;



    public class Main implements Runnable{


        private String str;



        public Main(String str){
            this.str = str;
        }
        @Override
        public void run() {
            System.out.println("Executing Thread- " + Thread.currentThread().getName());
// Adding to String
//            synchronized(this)
//            {
                str = str + " World";

                System.out.println("Modified String " + str);}
//        }

        public static void main(String[] args) throws InterruptedException
        {
            String str = "Hello";
            Main m = new Main("Hello");
            Thread t1 = new Thread(m);
            Thread t2 = new Thread(m);

// Thread t3 = new Thread(new StringThreadSafeExp(str));
            t1.start();
            t2.start();
            t1.join();
            t2.join();
// t3.start();
// Wait for all threads to terminate


            System.out.println("Original String is " + m.str);




// t3.join();
            System.out.println("Original String is " + m.str);

// System.out.println("Original String is " + str);

        }
}

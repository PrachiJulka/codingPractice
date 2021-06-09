package geeksForGeeks.Arrays.threading;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOdd {

    //Print Odd and even numbers from 1 to 20 in ascending order using two threads;
    private volatile boolean isOdd;

    public synchronized void evenPrint(List<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0) {
                while (!isOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("Even " + num.get(i));
                isOdd = false;
                notify();
            }
        }
    }


    public synchronized void oddPrint(List<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 != 0) {
                while (isOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }

                }

                System.out.println("Odd " + num.get(i));
                isOdd = true;
                notify();
            }
        }
    }

    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 3, 5, 2, 4));
        EvenOdd evenOdd = new EvenOdd();
        Thread t = new Thread(() -> evenOdd.evenPrint(list));
        Thread t1 = new Thread(() -> evenOdd.oddPrint(list));
        t.start();
        t1.start();
    }
}

class TaskEvenOdd implements Runnable {
    volatile List<Integer> evenOdd = new ArrayList<>();
    volatile boolean isOdd;
    volatile int i = 0;

    public TaskEvenOdd(List<Integer> evenOdd) {
        this.evenOdd = evenOdd;
        // this.isOdd = isOdd;
    }

    @Override
    public void run() {
//        int num =isOdd?1:2;

        while (evenOdd.size() > i) {
            if (evenOdd.get(i) == 0) {
                evenPrint(evenOdd.get(i));
            } else
                oddPrint(evenOdd.get(i));

            i++;
        }
    }

    public synchronized void evenPrint(int num) {

        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {

            }

        }
        System.out.println("Even " + num);
        isOdd = false;
        notify();
    }


    public synchronized void oddPrint(int num) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {

            }

        }
        System.out.println("Odd " + num);
        isOdd = true;
        notify();

    }
}



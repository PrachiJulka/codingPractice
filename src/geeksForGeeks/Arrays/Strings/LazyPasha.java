package geeksForGeeks.Arrays.Strings;

import java.util.Scanner;

public class LazyPasha {


    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        while (T > 0) {
            int N = sc.nextInt();
            int cases = sc.nextInt();
            String str = sc.next();
            int index = 0;
            while (cases > 0) {
                int type = sc.nextInt();
                int n = sc.nextInt();
                if (type == 1) {
                    n = n % N;
                    index = (index + (N - n)) % N;

                } else {
                    System.out.println(str.charAt((index + n) % N));
                }
                cases--;
            }


            T--;
        }


    }

}


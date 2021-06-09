package geeksForGeeks.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);

        Long max = 0L, min = 0L;

        for (int i = 0; i < 4; i++) {
            min += arr[i];
        }
        for (int i = 1; i < 5; i++) {
            max += arr[i];
        }
        System.out.print(min + " " + max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }


}



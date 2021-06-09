package geeksForGeeks.Arrays;
/*
Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).

        Input:
        The first line of the input contains T denoting the number of testcases.
         First line of eacg test case contains two space separated elements,
          N denoting the size of the array and an integer D denoting the number size of the rotation.
           Subsequent line will be the N space separated array elements.

        Output:
        For each testcase, in a new line, output the rotated array.

        Constraints:
        1 <= T <= 200
        1 <= N <= 107
        1 <= D <= N
        0 <= arr[i] <= 105

        Example:
        Input:
        2
        5 2
        1 2 3 4 5
        10 3
        2 4 6 8 10 12 14 16 18 20

        Output:
        3 4 5 1 2
        8 10 12 14 16 18 20 2 4 6

        Explanation :
        Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.*/


import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T > 0) {
            int N;
            N = sc.nextInt();
            int[] arr = new int[N];
            int d;
            d = sc.nextInt();
            d--;

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = (d + 1); i < N; i++) {
               System.out.print(arr[i] + " ");

            }
            for (int i = 0; i <= d; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");
            T--;
        }

        System.out.println(System.currentTimeMillis()-s);
    }

}

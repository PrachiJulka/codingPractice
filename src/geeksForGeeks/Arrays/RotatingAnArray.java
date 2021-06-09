package geeksForGeeks.Arrays;
/*
Given an array of N size. The task is to rotate array by d elements where d is less than or equal to N.

        Input:
        The first line of input contains a single integer T denoting the number of test cases.
        Then T test cases follow. Each test case consist of three lines.
        The first line of each test case consists of an integer N, where N is the size of array.
        The second line of each test case contains N space separated integers denoting array elements.
         The third line of each test case contains "d" .

        Output:
        Corresponding to each test case, in a new line, print the modified array.

        Constraints:
        1 ≤ T ≤ 200
        1 ≤ N ≤ 200
        1 ≤ A[i] ≤ 1000

        Example:
        Input
        1
        5
        1 2 3 4 5
        2

        Output
        3 4 5 1 2*/


import java.util.Scanner;

public class RotatingAnArray {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T > 0) {
            int N;
            N = sc.nextInt();
            int[] arr = new int[N];
            String str = "";
            int val = 0;

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int d;
            d = sc.nextInt();
            d--;
          /*  for (int i = 0; i < N; i++) {
                if (arr[i == d) {
                    val = i;
                }
            }*/
            for (int i = (d + 1); i < N; i++) {
                str += arr[i]+" ";

            }
            for (int i = 0; i <= d; i++) {
                str += arr[i]+" ";
            }
            System.out.println(str);
            T--;
        }

    }
}

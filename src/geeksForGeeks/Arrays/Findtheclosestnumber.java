package geeksForGeeks.Arrays;

/*
Given an array of sorted integers. The task is to find the closest value to the given number in array.
Array may contain duplicate values.

        Note: If the difference is same for two values print the value which is greater than the given number.

        Input:
        The first line of input contains an integer T denoting the number of test cases. Then T test cases follow.
         Each test case consists of two lines. First line of each test case contains two integers N & K
         and the second line contains N space separated array elements.

        Output:
        For each test case, print the closest number in new line.

        Constraints:
        1<=T<=100
        1<=N<=105
        1<=K<=105
        1<=A[i]<=105

        Example:
        Input:
        2
        4 4
        1 3 6 7
        7 4
        1 2 3 5 6 8 9

        Output:
        3
        5*/

import java.util.Scanner;

public class Findtheclosestnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int num = 0, diff = arr[N - 1], minus;
            for (int i = 0; i < N; i++) {
                    minus = K - arr[i];
                    if(minus<0){
                        minus=-minus;
                    }
                    if (diff > minus) {
                        num = arr[i];
                        diff = minus;
                    } else if (diff == minus) {
                        num = arr[i];
                        diff = minus;
                    }
                }
            System.out.println(num);

            T--;
        }

    }
}

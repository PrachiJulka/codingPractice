package geeksForGeeks.Arrays;
/*
Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.

        Input:
        The first line of input contains an integer T denoting the number of test cases.
         The first line of each test case contains a single integer N denoting the size of array and the size of
          subarray K. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

        Output:
        Print the maximum for every subarray of size k.

        Constraints:
        1 ≤ T ≤ 200
        1 ≤ N ≤ 107
        1 ≤ K ≤ N
        0 ≤ A[i] <= 107

        Example:
        Input:
        2
        9 3
        1 2 3 1 4 5 2 3 6
        10 4
        8 5 10 7 9 4 15 12 90 13

        Output:
        3 3 4 5 5 5 6
        10 10 10 15 15 90 90

        Explanation:
        Testcase 1: Starting from first subarray of size k = 3, we have 3 as maximum.
         Moving the window forward, maximum element are as 3, 4, 5, 5, 5 and 6.*/

import java.util.HashSet;
import java.util.Scanner;

public class MaximumOfAllSubarraysOfSizeK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int max;
            for (int i = 0; i < N; i++) {
                max = arr[i];
                if (N >= i + K) {
                    for (int j = i; j < i + K; j++) {
                        if (max < arr[j])
                            max = arr[j];
                    }
                    System.out.print(max + " ");
                }

            }
            System.out.println(" ");
        T--;
        }
    }
}

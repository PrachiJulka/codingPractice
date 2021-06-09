package geeksForGeeks.Arrays;
/*
Given an array A[] of size N and an integer K.
 Your task is to complete the function countDistinct() which prints the count of distinct numbers
  in all windows of size k in the array A[].

        Input:
        The first line of input contains an integer T denoting the number of test cases.
         Then T test cases follow. Each test case contains two integers N and K.
         Then in the next line are N space separated values of the array A[].

        Output:
        For each test case in a new line print the space separated values denoting counts of distinct numbers
         in all windows of size k in the array A[].

        Constraints:
        1 <= T <= 100
        1 <= N, K <= 100
        1 <= A[] <= 100

        Example(To be used only for expected output):
        Input:
        2
        7 4
        1 2 1 3 4 2 3
        3 2
        4 1 1

        Output:
        3 4 4 3
        2 1

        Note:The Input/Ouput format and Example given are used for system's internal purpose,
         and should be used by a user for Expected Output only. As it is a function problem,
          hence a user should not read any input from stdin/console.
           The task is to complete the function specified, and not to write the full code.*/


import java.util.*;

public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T > 0) {
            int N, K;
            N = sc.nextInt();
            K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }


            for (int i = 0; i < N; i++) {
                HashSet<Integer> distinctCounts = new HashSet<>();
                if (N >= i + K) {
                    for (int j = i; j < i + K; j++) {
                            distinctCounts.add(arr[j]);
                    }
                    System.out.print(distinctCounts.size() + " ");
                }
            }
            T--;
        }
    }
}

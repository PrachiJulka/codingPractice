package geeksForGeeks.Arrays;
/*

Given an array of positive integers. Your task is to find the leaders in the array.
        Note: An element of array is leader if it is greater than or equal to all the elements to its right side.
         Also, the rightmost element is always a leader.

        Input:
        The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
        The first line of each test case contains a single integer N denoting the size of array.
        The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

        Output:
        Print all the leaders.

        Constraints:
        1 <= T <= 100
        1 <= N <= 107
        0 <= Ai <= 107

        Example:
        Input:
        3
        6
        16 17 4 3 5 2
        5
        1 2 3 4 0
        5
        7 4 5 7 3
        Output:
        17 5 2
        4 0
        7 7 3

        Explanation:
        Testcase 3: All elements on the right of 7 (at index 0) are smaller than or equal to 7.
        Also, all the elements of right side of 7 (at index 3) are smaller than 7.
         And, the last element 3 is itself a leader since no elements are on its right.
*/

import java.util.Scanner;

public class LeadersInAnArray {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T > 0) {
            int N;
            N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int leader = arr[N - 1];
            String str = "" + leader + " ";
            for (int j = N - 2; j >= 0; j--) {
                if (arr[j] >= leader) {
                    str += arr[j] + " ";
                    leader = arr[j];
                }
            }
            System.out.println(str);
            T--;
            System.out.println(System.currentTimeMillis()-s);
        }


    }
}

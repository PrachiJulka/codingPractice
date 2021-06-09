package geeksForGeeks.Arrays;
/*
Given an array of penalties P, an array of car numbers C,
 and also the date D. The task is to find the total fine which will be collected on the given date.
  Fine is collected from odd-numbered cars on even dates and vice versa.

        Input:
        The first line of input contains an integer T denoting the number of test cases.
         Then T test cases follow. Each test case consists of three lines of input.
         First line of each test case contains two integers N & D,
         second line contains N space separated car numbers C and third line contains N space separated penalties P.

        Output:
        For each test case,In new line print the total fine.

        Constraints:
        1 <= T <= 100
        1 <= N <= 105
        1000 <= Ci <= 9999
        1 <= D <= 31
        1 <= Pi <= 103
        Example:
        Input:
        2
        4 12
        2375 7682 2325 2352
        250 500 350 200
        3 8
        2222 2223 2224
        200 300 400
        Output:
        600
        300

        Explantion:
        Testcase1: The date is 12 (even), so we collect the fine from odd numbered cars.
        The odd numbered cars and the fines associated with them are as follows:
        2375 -> 250
        2325 -> 350
        The sum of the fines is 250+350 = 600*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheFine {
    public static void main(String[] args) {
        int T;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        while (T > 0) {
            int N = scanner.nextInt();
            int D = scanner.nextInt();
            List<Integer> arrayIndex = new ArrayList<>();
            int[] arr = new int[N];
            int sum = 0;

            if (D % 2 != 0) {
                for (int i = 0; i < N; i++) {
                    int arrNum = scanner.nextInt();
                    if (arrNum % 2 == 0) {
                        arrayIndex.add(i);
                    }
                }
            } else {
                for (int i = 0; i < N; i++) {
                    int arrNum = scanner.nextInt();
                    if (arrNum % 2 != 0) {
                        arrayIndex.add(i);
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            for (Integer i : arrayIndex) {
                sum += arr[i];
            }
            System.out.println(sum);


            T--;
        }

    }
}

package geeksForGeeks.Arrays;
/*

Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.

        Input:
        The first line contains T, denoting the number of testcases.
        Then follows description of testcases. Each case begins with a single positive integer N denoting the size of array.
         The second line contains the N space separated positive integers denoting the elements of array A.

        Output:
        For each testcase, print "Yes" or  "No" whether it is Pythagorean Triplet or not (without quotes).

        Constraints:
        1 <= T <= 100
        1 <= N <= 107
        1 <= A[i] <= 1000

        Example:
        Input:
        1
        5
        3 2 4 6 5

        Output:
        Yes

        Explanation:
        Testcase 1: a=3, b=4, and c=5 forms a pythagorean triplet, so we print "Yes"
*/


import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int num;
            int sum;
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int j = 0;
            for (int i = 0; i < N; i++) {
                num = arr[i] * arr[i];
                j = i + 1;
                if (N > j) {
                    for (int k = j + 1; k < N; k++) {
                        int num3 = (arr[k] * arr[k]);
                        sum = num + (arr[j] * arr[j]);
                        if (num3 == sum) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println("Yes");
                        break;
                    }

                }
                if (flag) {

                    break;
                }
            }
            if (!flag) {
                System.out.println("No");
            }

            T--;
        }


    }
}

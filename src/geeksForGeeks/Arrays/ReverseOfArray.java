package geeksForGeeks.Arrays;
/*Given an array A of size N, print the reverse of it.

        Input:
        First line contains an integer denoting the test cases 'T'.
         T testcases follow. Each testcase contains two lines of input.
         First line contains N the size of the array A.
          The second line contains the elements of the array.

        Output:
        For each testcase, in a new line, print the array in reverse order.

        Constraints:
        1 <= T <= 100
        1 <= N <=100
        0 <= Ai <= 100

        Example:
        Input:
        1
        4
        1 2 3 4
        Output:
        4 3 2 1*/

import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {

        int T;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        while(T>0){
            int N;
            N=sc.nextInt();
            int[] arr=new int[N];
            for (int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=N-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");

            T--;
        }


    }
}

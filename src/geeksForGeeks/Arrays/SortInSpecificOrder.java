package geeksForGeeks.Arrays;
/*
Given an array A of positive integers.
Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order,
 rest portion contains even numbers sorted in ascending order.

        Input:
        The first line of input contains an integer T denoting the number of test cases.
         Then T test cases follow. Each test case contains an integer N denoting the size of the array.
          The next line contains N space separated values of the array.

        Output:
        For each test case in a new line print the space separated values of the modified array.

        Constraints:
        1 <= T <= 103
        1 <= N <= 107
        0 <= Ai <= 1018

        Example:
        Input:
        2
        7
        1 2 3 5 4 7 10
        7
        0 4 5 3 7 2 1

        Output:
        7 5 3 1 2 4 10
        7 5 3 1 0 2 4

        Explanation:
        Testcase1: Array elements 7 5 3 1 are odd and sorted in descending order,
         whereas 2 4 10 are even numbers and sorted in ascending order.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortInSpecificOrder {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){

            int N=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }

            List<Integer> evenList=new ArrayList<>();
            List<Integer> oddList=new ArrayList<>();
            for(int i=0;i<N;i++){
                if(arr[i]%2==0) {
                    evenList.add(arr[i]);
                }
                else{
                    oddList.add(arr[i]);
                }

            }
            Collections.sort(oddList);
            Collections.sort(evenList);
            for(int i=(oddList.size()-1);i>=0;i--){
                System.out.print(oddList.get(i)+" ");
            }
            for (int i=0;i<evenList.size();i++){
                System.out.print(evenList.get(i)+" ");
            }

            System.out.println(" ");





            T--;
        }

    }
}

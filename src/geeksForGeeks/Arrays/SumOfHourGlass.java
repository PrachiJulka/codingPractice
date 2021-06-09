package geeksForGeeks.Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SumOfHourGlass {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[][] = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        int maxSum=0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j + 2 < 6 && i + 2 < 6) {
                 sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                 if(sum>maxSum){
                     maxSum=sum;
                 }
                }

            }
        }
        System.out.println(maxSum);


    }


}

package geeksForGeeks.Arrays;

import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {
        int[] arr=new int[4];
        int[] arr1=new int[2];
        Scanner scanner=new Scanner(System.in);

        for (int i=0;i<4;i++){
            arr[i]= scanner.nextInt();
        }

        int num;
        num= scanner.nextInt();
        for (int i=0;i<2;i++){
           /// System.out.println(i-num);
            arr1[i]=arr[i];
        }

        for (int i=2;i<4;i++) {
           // System.out.println(arr1[i]);

            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<2;i++){
            System.out.print(arr1[i]+" ");
        }
    }


}

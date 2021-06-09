package geeksForGeeks.Arrays.Strings;
/*
URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
        has sufficient space at the end to hold the additional characters, and that you are given the "true"
        length of the string. (Note: If implementing in Java, please use a character array so that you can
        perform this operation in place*/

import java.util.Scanner;

public class Urlify {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String abc=sc.nextLine();
//        char[] chars=abc.toCharArray();
        for (int i=0;i<abc.length();i++){
            if (abc.charAt(i)==' '){
                System.out.print("%20");
            }
            else
                System.out.print(abc.charAt(i));
        }
    }
}

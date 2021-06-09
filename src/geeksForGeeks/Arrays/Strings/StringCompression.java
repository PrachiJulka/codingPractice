package geeksForGeeks.Arrays.Strings;
/*
Implement a method to perform basic string compression using the counts
        of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
        "compressed" string would not become smaller than the original string, your method should return
        the original string. You can assume the string has only uppercase and lowercase letters (a - z).*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compressString(str));
    }


    public static String compressString(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    stringBuffer.append((str.charAt(i) + Integer.toString(count)));
                    i = j - 1;
                    break;
                }
                if (str.length() - 1 == j) {
                    stringBuffer.append(str.charAt(i) + Integer.toString(count));
                }
            }
        }
        System.out.println(stringBuffer);
        return stringBuffer.toString();
    }

}

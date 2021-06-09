package geeksForGeeks.Arrays.Strings;

import java.util.Arrays;

public class StringPermutationOfeachOther {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        char[] chars;
        chars = a.toCharArray();
        char[] chars2;
        chars2 = b.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars2);
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars2[i]) {
                flag = false;
                break;
            }
        }
        if (!flag)
            System.out.println("Not Permutation");
        else
            System.out.println("Permutation");

    }
}

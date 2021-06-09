package geeksForGeeks.Arrays.MayChallengeLeetCode;

import java.util.ArrayList;
import java.util.List;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        int[] chars = new int[26];
        int count = s1.length();
        for (Character c : s1.toCharArray()) {
            chars[c - 'a']++;
        }
        int i = 0, j = 0;

        for (; i < s2.length(); ) {
            if (chars[s2.charAt(i++) - 'a']-- >= 1) {
                count--;
            }

            if (count == 0)
                return true;
            if (i - j == s1.length() && chars[s2.charAt(j++) - 'a']++ >= 0) {
                count++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean c=PermutationInString.checkInclusion("ab","eidboaoo");
        System.out.println(c);
    }
}

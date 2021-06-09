package geeksForGeeks.Arrays.MayChallengeLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> results = new ArrayList<>();
        int[] chars = new int[26];
        int count = p.length();
        for (Character c : p.toCharArray()) {
            chars[c - 'a']++;
        }
        int i = 0, j = 0;

        for (; i < s.length(); ) {
            if (chars[s.charAt(i++) - 'a']-- >= 1) {
                count--;
            }

            if (count == 0)
                results.add(j);
            if (i - j == p.length() && chars[s.charAt(j++) - 'a']++ >= 0) {
                count++;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        AllAnagramsInString.findAnagrams("cbaebabacd", "abc");
    }
}

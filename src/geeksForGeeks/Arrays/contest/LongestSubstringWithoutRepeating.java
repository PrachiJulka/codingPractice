package geeksForGeeks.Arrays.contest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> listOfCharacters=new HashMap<>();
        int count=0;
        if(s==null || s.isEmpty())
            return 0;


        for(int i=0;i<s.length();i++){
            if(!listOfCharacters.containsKey(s.charAt(i))){
                listOfCharacters.put(s.charAt(i),i);
            }
            else{
                if(count<listOfCharacters.size())
                    count=listOfCharacters.size();
                i=listOfCharacters.get(s.charAt(i));
                listOfCharacters.clear();
            }

        }

        if(count<listOfCharacters.size())
            count=listOfCharacters.size();

        return count;


    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}

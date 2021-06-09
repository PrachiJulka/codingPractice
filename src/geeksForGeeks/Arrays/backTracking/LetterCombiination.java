package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombiination {
    Map<Character,String> phone=new HashMap<Character,String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    int j=0;
    List<String> results;
    public List<String> letterCombinations(String digits) {
        results=new ArrayList<>();
        backtrack(digits,0,"");
        return results;
        //  return null;
    }

    void backtrack(String digits,int d,String num){
        if(num.length()==digits.length()){
            results.add(num);
            return;
        }
        if(j>=digits.length())
            return;
        String str=phone.get(digits.charAt(d));
        for(int i=0;i<str.length();i++){
            num+=str.charAt(i);
            backtrack(digits,++j,num);
            num=num.substring(0,num.length()-1);
            --j;
        }
    }

    public static void main(String[] args) {
        new LetterCombiination().letterCombinations("234");
    }
}

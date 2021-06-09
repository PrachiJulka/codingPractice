package geeksForGeeks.Arrays.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Groupanagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>> list=new ArrayList<>();
        List<String> hash=new ArrayList<>();
        String str="",str1="";
        for(int i=0;i<strs.length;i++){
            List<String> subList=new ArrayList<>();

            if(!hash.contains(strs[i])){
                hash.add(strs[i]);
                str=sortString(strs[i]);
                subList.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    str1=sortString(strs[j]);
                    if(str.equals(str1)){
                        hash.add(strs[j]);
                        subList.add(strs[j]);
                    }
                }
                list.add(subList);
            }

        }

        return list;
    }

   static String sortString(String str){
        char[] ch=new char[str.length()];
        ch=str.toCharArray();
       Arrays.sort(ch);
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String[] str=new String[]{"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(str);
    }

}

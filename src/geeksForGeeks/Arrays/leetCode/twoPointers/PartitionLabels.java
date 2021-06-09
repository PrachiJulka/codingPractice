package geeksForGeeks.Arrays.leetCode.twoPointers;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        int[] lastOccurence=new int[26];
        if(S.length()==0)
            return null;
        for(int i=0;i<S.length();i++){
            lastOccurence[S.charAt(i)-'a']=i;
        }
        List<Integer> results=new ArrayList<>();
        int i=0,last=0,first=0;
        last=lastOccurence[S.charAt(i)-'a'];
        while(i<S.length()){
            if(last<lastOccurence[S.charAt(i)-'a']){
                last=lastOccurence[S.charAt(i)-'a'];
            }

            if(i==last){
                results.add((last-first)+1);
                first=i+1;
//                first--;

            }
            i++;
        }
        return results;
    }

    public static void main(String[] args) {
        new PartitionLabels().partitionLabels("").forEach(q -> System.out.println(q));
    }
}

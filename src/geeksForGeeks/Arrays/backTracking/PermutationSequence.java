package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    List<String> results;
    public String getPermutation(int n, int k) {

        results=new ArrayList<>();
        String str="";
/*
        for (int i=0;i<n;i++){
            str+=(""+(i+1));
        }*/
        boolean[] visited=new boolean[n];
        permute(str,"",visited,n,k);
        return results.get(k-1);
    }

    void permute(String str,String nStr,boolean[] visited,int n,int k){
        if (k==results.size()){
            return;
        }

        if(n==nStr.length()){
            results.add(nStr);
            return;
        }

        for(int i=0;i<n;i++){
            if (!visited[i]){
                visited[i]=true;
                nStr+=""+(i+1);
                permute(str,nStr,visited,n,k);
                visited[i]=false;
                nStr=nStr.substring(0,nStr.length()-1);
            }
        }

    }

    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        System.out.println(time);
        new PermutationSequence().getPermutation(9,
                138270
        );
        System.out.println(System.currentTimeMillis()-time);
    }


}

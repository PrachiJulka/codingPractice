package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationOfGivenString {
    // Function to print all the distinct
    // permutations of str
    static void printDistinctPermutn(String str,
                                     String ans,List<String> series)
    {
         if(str.length()==0){
            if(!series.contains(ans)){
                series.add(ans);
             }
            return;
        }

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            String res=str.substring(0,i)+str.substring(i+1);

            printDistinctPermutn(res,ans+ch,series);

        }


    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "geek";
        List<String> series=new ArrayList<>();

        printDistinctPermutn(s, "",series);
        for (int i=0;i<series.size();i++)
            System.out.print(series.get(i)+" ");

    }
}

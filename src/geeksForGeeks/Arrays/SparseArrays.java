package geeksForGeeks.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s, q;
        s = sc.nextInt();
        Map<String,Integer> matchingStrings=new HashMap<>();
        for (int i = 0; i < s; i++) {
            String str=sc.next();
            if (matchingStrings.containsKey(str)) {
                matchingStrings.put(str, matchingStrings.get(str) + 1);
            }
            else{
                matchingStrings.put(str,1);
            }
        }

        q = sc.nextInt();
        String[] queries = new String[q];

        for (int i = 0; i < q; i++) {
            queries[i] = sc.next();
        }

        for (String str:queries){
            if (matchingStrings.containsKey(str)){
                System.out.print(matchingStrings.get(str)+" ");
            }
        }



    }
}

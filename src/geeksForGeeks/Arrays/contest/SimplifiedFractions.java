package geeksForGeeks.Arrays.contest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimplifiedFractions {
    public static List<String> simplifiedFractions(int n) {
        Set<String> results=new HashSet<>();
        for(int i=1;i<=n;i++){
            for(int j=2;j<=n;j++){
                if(j>i){
                    int rem=i%j;
                    if(rem!=0){
                        results.add(convertToFraction(i,j));
                    }
                }
            }
        }
        return new ArrayList<>(results);
    }

    public static int findMultiple(int a, int b) {
        return b == 0 ? a : findMultiple(b, a % b);
    }

    public static String convertToFraction(int a, int b) {
        int multiple = findMultiple(a, b);
        return (a / multiple) + "/" + (b / multiple);

    }

    public static void main(String[] args) {
        System.out.println(SimplifiedFractions.simplifiedFractions(6));
    }
}

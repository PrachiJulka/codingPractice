package geeksForGeeks.Arrays.contest;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreaterNoOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
/*
        if (candies.length==0){
            return
        }*/
        List<Boolean> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
                max=candies[i];
        }
        for (int i=0;i<candies.length;i++){
            int sum=candies[i]+extraCandies;
            if (sum>=max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }

    public static void main(String[] args) {

    }


}

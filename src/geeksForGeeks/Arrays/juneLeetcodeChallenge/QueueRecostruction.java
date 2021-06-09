package geeksForGeeks.Arrays.juneLeetcodeChallenge;

import java.util.ArrayList;
import java.util.List;

public class QueueRecostruction {
    public static int[][] reconstructQueue(int[][] people) {

        sort(people);
        return people;

    }

    static void sort(int[][] people){
        boolean[] indexSorted=new boolean[people.length];
        for(int i=0;i<people.length;i++){
            int min_idx = i;
            for (int j = i+1; j < people.length; j++)
                if (people[j][0] < people[min_idx][0] && !indexSorted[min_idx])
                    min_idx = j;

            List<Integer> l=new ArrayList<>();
            l.add(people[min_idx][0]);
            l.add(people[min_idx][1]);
            people[min_idx][0]=people[l.get(1)][0];
            people[min_idx][1]=people[l.get(1)][1];
            people[l.get(1)][0]=l.get(0);
            people[l.get(1)][1]=l.get(1);
            indexSorted[l.get(1)]=true;


        }
    }

    public static void main(String[] args) {
        QueueRecostruction.reconstructQueue(new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}});
    }
}

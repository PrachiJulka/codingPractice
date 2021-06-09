package geeksForGeeks.Arrays;

import java.util.*;

public class DemoQ2 {

    public static int getKth(int lo, int hi, int k) {
        Map<Integer,Integer> integerMap=new HashMap<>();
        for(int i=lo;i<=hi;i++) {
            int val = i, count = 0;
            while (val != 1) {
                if (val % 2 == 0) {
                    val /= 2;

                } else {
                    val = 3 * val + 1;
                }
                count++;
            }
            integerMap.put(i,count);

        }

        List<Map.Entry<Integer,Integer>> sortList=new ArrayList<>(integerMap.entrySet());
        Collections.sort(sortList,new SortAsscending());
        return sortList.get(k-1).getKey();

        }

    public static void main(String[] args) {
       int c= DemoQ2.getKth(1,1000,777);
        System.out.println(c);
    }
    }

class SortAsscending implements Comparator<Map.Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
        if ((entry1.getValue()).compareTo(entry2.getValue()) == 0) {
            return entry1.getKey().compareTo(entry2.getKey());
        } else {
            return entry1.getValue().compareTo(entry2.getValue());
        }
    }
}

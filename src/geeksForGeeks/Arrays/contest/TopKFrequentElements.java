package geeksForGeeks.Arrays.contest;

import java.util.*;

public class TopKFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);


        }

        List<Map.Entry<Integer, Integer>> val = new ArrayList<>(map.entrySet());
        Collections.sort(val,new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });
        int max=0;
        for(Map.Entry<Integer, Integer> e:val){
            if(max<k){
               // max=e.getValue();
              //  System.out.println(e.getKey());
                list.add(e.getKey());
                k--;
            }
        }
        return list;
     }

    public static void main(String[] args) {
       List<Integer> l= TopKFrequentElements.topKFrequent(new int[]{1,1,1,2,2,3},2);
       for(Integer l1:l){
           System.out.println(l1);
       }
    }
}

package geeksForGeeks.Arrays.contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueElement {
   /* List<Map<Integer,Integer>> uniqueElements=new ArrayList<>();
    public UniqueElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            Map<Integer,Integer> map=new HashMap<>();
            if(uniqueElements.containsKey(nums[i]))
                uniqueElements.put(nums[i],uniqueElements.get(nums[i])+1);
            else{
                uniqueElements.put(nums[i],0);
            }
        }
    }

    public int showFirstUnique() {
        int val=-1;
        if(uniqueElements.size()==0)
            return -1;
        else{
            for(Map.Entry<Integer,Integer> map:uniqueElements.entrySet()){
                if(map.getValue()==0) {
                    val = map.getKey();
                    break;
                }
            }
        }
        return val;

    }

    public void add(int value) {
        if(uniqueElements.containsKey(value))
            uniqueElements.put(value,uniqueElements.get(value)+1);
        else{
            uniqueElements.put(value,0);
        }
    }*/

/*
    public static void main(String[] args) {
        UniqueElement uniqueElement=new UniqueElement(new int[]{2,3,5});
        System.out.println(uniqueElement.showFirstUnique());
        uniqueElement.add(5);
        System.out.println(uniqueElement.showFirstUnique());
        uniqueElement.add(2);
        System.out.println(uniqueElement.showFirstUnique());
        uniqueElement.add(3);
        System.out.println(uniqueElement.showFirstUnique());
    }*/
}

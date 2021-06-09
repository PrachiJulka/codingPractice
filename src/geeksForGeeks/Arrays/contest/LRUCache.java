package geeksForGeeks.Arrays.contest;

import java.util.*;

public class LRUCache {

    int size;
    Map<Integer,StoreValue> lists=new HashMap<>();
    public LRUCache(int capacity) {
        this.size=capacity;
    }

    public int get(int key) {
        if(lists.containsKey(key))
        {
            lists.put(key,new StoreValue(lists.get(key).value,lists.get(key).time+1));
            return lists.get(key).value;
        }
        else
            return -1;
    }

    public void put(int key, int value) {
        if(size==0){
            List<Map.Entry<Integer,StoreValue>> sortList=new ArrayList<>(lists.entrySet());
            Collections.sort(sortList,(m1, m2) -> m1.getValue().compareTo(m2.getValue()));
            int s=sortList.get(0).getValue().time;
            for(Map.Entry<Integer,StoreValue> m:sortList){
                int v=m.getValue().time;
                if(s==v){
                    lists.remove(m.getKey());
                }
            }
        }

        lists.put(key,new StoreValue(value,0));
        size--;

    }

    public static void main(String[] args) {
        LRUCache obj = new LRUCache(2);
         obj.put(1,1);
         obj.put(2,2);
        System.out.println(obj.get(1));
        obj.put(3,3);
        System.out.println(obj.get(2));
        obj.put(4,4);
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));
    }
}
class StoreValue implements Comparable<StoreValue>{
    int value;
    int time;

    StoreValue(int value,int time){
        this.time=time;
        this.value=value;
    }

    public int compareTo(StoreValue sv){
        if(time==sv.time)
            return 0;
        else if(time<sv.time)
            return -1;
        else
            return 1;
    }
}

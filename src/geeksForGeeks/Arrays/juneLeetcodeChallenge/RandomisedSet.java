package geeksForGeeks.Arrays.juneLeetcodeChallenge;

import java.util.*;

class RandomizedSet {

    Set<Integer> set;
    // List<Integer> arrayList;
    Random rand;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        set=new HashSet<>();
        rand=new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.add(val)){
            return true;
        }
        else{
            return false;
        }

    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        else
            return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {

        int max = set.size();
        if(max > 0){
            Random r = new Random();
            int index = r.nextInt(max);
            return (int)set.stream().toArray()[index];
        }
        return -1;

    }
    public static void main(String[] args) {
        RandomizedSet randomizedSet=new RandomizedSet();
        randomizedSet.insert(2);
        randomizedSet.insert(1);
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());


    }
}

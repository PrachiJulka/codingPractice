package geeksForGeeks.Arrays.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution() {
        this.map = new HashMap<>();
    }


    public static void main(String[] args) throws IOException {
        HashSet<ArrayList<Integer>> set=new HashSet<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        Integer a=new Integer(2);
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(3);
        set.add(list1);
        System.out.println(list1.hashCode()+" "+a.hashCode());
        set.add(list2);
        System.out.println(list2.hashCode());
        System.out.println(set.size()); // 1
    }


}

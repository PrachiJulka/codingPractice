package geeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Olx {

//    A string S of lowercase English letters is given. We want to partition this string into
//    as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.
//    Input: S = "ababcbacadefegdehijhklij"
    //abaaaaadefeaaabba
    //deefeaaabbb deefe aabbb
    //abcd
    //a b c d
    //aabb
    //aa bb
    //[a,a]
//    Output: [9,7,8]
    // a->11
    //b->5
    //ababcdef
    // max=3
    // a -> 2
    // b ->3
    //a
    //b==max abab
    //max=5
    // c->4 ->c
    //d->5->.d
    //e->6 ->e
    //f->7->f
//    Explanation:
//    The partition is "ababcbaca", "defegde", "hijhklij".
//    This is a partition so that each letter appears in at most one part.
//    A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.



//    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
//    and nums[i] + nums[j] + nums[k] == 0.
//i=0.j=i+1,k=i+2
    //Input: nums = [-1,0,1,2,-1,-4]
    //Output: [[-1,-1,2],[-1,0,1]]

    public List<Integer> findPartition(String str){
        List<Integer> list=new ArrayList<>();
        int max=0;
        Character ch;
        for (int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    if(max<j) {
                        max = j;
                    }
                }
            }
            list.add(max-i);
        }
        return list;
    }

    public static void main(String[] args) {
        String s="ababcbacadefegdehijhklij";
    }

}

class Singleton{

    private Singleton(){

    }

    private volatile static Singleton singleton=null;
    public static Singleton getSingleton(){

        if(singleton==null){
            synchronized(Singleton.class) {
                if(singleton==null){
                    singleton= new Singleton();
                }
            }
        }
        return singleton;

    }

}

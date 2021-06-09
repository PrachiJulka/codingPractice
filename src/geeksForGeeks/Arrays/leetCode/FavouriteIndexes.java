package geeksForGeeks.Arrays.leetCode;

import java.util.*;

public class FavouriteIndexes {
    public static List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {

        // Brute Force
        List<Set<String>> favoriteCompaniesSet = new ArrayList();

        // Convert to List<Set>
        for(List<String> person:favoriteCompanies) {
            Set<String> companies = new HashSet(person);
            favoriteCompaniesSet.add(companies);
        }

        List<Integer> res = new ArrayList();
        for(int i=0;i<favoriteCompaniesSet.size();++i) {
            boolean isSubSet=false;
            for(int j=0;j<favoriteCompaniesSet.size();++j) {
                Set set1 = favoriteCompaniesSet.get(i);
                Set set2 = favoriteCompaniesSet.get(j);
                if(i!=j && set2.size()>set1.size() && set2.containsAll(set1)) {
                    isSubSet=true;
                    break;
                }
            }

            if(!isSubSet)
                res.add(i);
        }

        return res;
    }

    public static void main(String[] args) {


        List<List<String>> lists=new ArrayList<>();
        List<String> l=new ArrayList<>();
        l.addAll(0,new ArrayList<>(Arrays.asList("leetcode","google","facebook")));
        lists.add(l);
        lists.add(new ArrayList<>(Arrays.asList("google","microsoft")));
        lists.add(new ArrayList<>(Arrays.asList("google","facebook")));

        lists.add(new ArrayList<>(Arrays.asList("google")));

        lists.add(new ArrayList<>(Arrays.asList("amazon")));



        FavouriteIndexes.peopleIndexes(lists);
    }

}

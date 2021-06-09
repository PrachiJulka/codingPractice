package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {

    static void subSets(String str, String subSet, List<String> list) {
      //  if (!str.isEmpty())
        list.add(subSet);

        for (int i = 0; i < str.length(); i++) {
            subSets(str.substring(i + 1), subSet + str.charAt(i), list);
        }
    }

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        subSets("wlrbbmqbh", "", str);
        Collections.sort(str);
        for (int i = 0; i < str.size(); i++) {
            System.out.print(str.get(i).trim() + " ");
        }
    }
}

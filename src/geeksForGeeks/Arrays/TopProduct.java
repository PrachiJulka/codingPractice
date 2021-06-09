package geeksForGeeks.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TopProduct {

    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int cases = Integer.parseInt(br.readLine());
        int c = 0;
        while (cases > 0) {
            Map<String, Integer> listOfProducts = new HashMap<>();
            c = Integer.parseInt(br.readLine());
            int maxValue = 0;
            while (c > 0) {
                String value = br.readLine();
                if (value.toLowerCase().equals("top")) {
                    List<Map.Entry<String, Integer>> val = new ArrayList<>(listOfProducts.entrySet());
                    Collections.sort(val, new SortInDescendingOrder());
                    maxValue=val.get(0).getValue();
                    for (Map.Entry<String, Integer> mapValue : val) {
                        if (mapValue.getValue() == maxValue) {
                            System.out.print(mapValue.getKey() + " ");
                        }
                        else {
                            break;
                        }
                    }
                    System.out.println();
                } else {
                    String[] str=value.split(" ");
                    int units = Integer.parseInt(str[1]);
                    String key = str[0];
                    if (listOfProducts.containsKey(key)) {
                        listOfProducts.put(key, listOfProducts.get(key) + units);

                    } else {
                        listOfProducts.put(key, units);
                  }
                }
                c--;
            }
            cases--;
        }
    }
}

class SortInDescendingOrder implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
        if ((entry2.getValue()).compareTo(entry1.getValue()) == 0) {
            return entry1.getKey().compareTo(entry2.getKey());
        } else {
            return entry2.getValue().compareTo(entry1.getValue());
        }
    }
}

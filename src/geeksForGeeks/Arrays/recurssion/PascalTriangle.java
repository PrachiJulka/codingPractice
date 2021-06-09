package geeksForGeeks.Arrays.recurssion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return new ArrayList<>(Arrays.asList(1));
        List<Integer> lastRow = getRow(rowIndex - 1);
        List<Integer> newRow = new ArrayList<>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < lastRow.size(); ++i) {
            right = lastRow.get(i);
            newRow.add(left + right);
            left = right;
        }
        newRow.add(1);
        return newRow;
    }

    public static void main(String[] args) {
        PascalTriangle.getRow(3);
    }
}

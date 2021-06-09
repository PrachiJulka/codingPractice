package geeksForGeeks.Arrays.backTracking;

import java.util.Arrays;

public class NumTileBacktracking {
int count=0;
    public int numTilePossibilities(String s) {
        if (s == null || s.length() == 0)
            return 0;

        char[] arr = s.toCharArray();

        boolean[] bites = new boolean[s.length()];

        Arrays.sort(arr); // sort a str in order we can apply the bites arr in order skip dulicates

        rec(arr, bites);

        return count;
    }

    private void rec(char[] arr, boolean[] bites) {
        for (int i = 0; i < arr.length; i++) {
            if (bites[i]) // if we "visited" this bit before, skip it
                continue;

            bites[i] = true;
            count++;
            rec(arr, bites);
            bites[i] = false;

            while (i+1 < arr.length && arr[i] == arr[i+1]) // skip duplicates
                i++;
        }
    }




    public static void main(String[] args) {
        NumTileBacktracking n=new NumTileBacktracking();
        System.out.println(n.numTilePossibilities("AAB"));
    }

}

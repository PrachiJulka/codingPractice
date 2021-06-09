package geeksForGeeks.Arrays.leetCode;

import java.util.Arrays;

public class HIndex {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i = citations.length - 1; i >= 0; i--) {
            if(citations[i] < citations.length - i) {
                return citations.length - i - 1;
            }
        }
        return citations.length;
    }

    public static void main(String[] args) {
        HIndex.hIndex(new int[]{ 6, 6, 6, 6, 7 });
    }
}

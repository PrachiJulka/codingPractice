package geeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetMatricZero {
    public static void setZeroes(int[][] matrix) {
        Map<Integer, List<Integer>> rowColumn=new HashMap<>();

        for(int i=0;i<matrix.length;i++){
            List<Integer> sub=new ArrayList<>();
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0) {
                    sub.add(j);
                }
            }
            rowColumn.put(i, sub);
        }
        for(Map.Entry<Integer, List<Integer>> mapValue : rowColumn.entrySet()){
            for (Integer j:mapValue.getValue()) {
                for (int i = 0; i < matrix[mapValue.getKey()].length; i++) {
                    matrix[mapValue.getKey()][i] = 0;
                }
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arrays={
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(arrays);
    }
}

package geeksForGeeks.Arrays.leetCode;

public class SearchA2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int firstI=0,firstJ=0;
        int lastI=matrix.length-1,lastJ=matrix[0].length-1;
        if(matrix.length==0 || matrix[0].length==0){
            return false;
        }
       // System.out.println(matrix.length);

        while(firstJ<=lastJ && firstI<=lastI){
            int midI=firstI+(lastI-firstI)/2;
            int midJ=firstJ+(lastJ-firstJ)/2;

            if(matrix[midI][0]>target && matrix[midI][lastJ] > target){
                lastJ=midJ-1;
                lastI = midI - 1;
               // lastJ=midJ-1;
            }
            else if (matrix[midI][midJ] < target && matrix[midI][lastJ]>target) {
                firstI = midI;
                // firstJ=midJ+1;
                firstJ=midJ;
               // firstJ=midJ+1;
            }
            else{
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
       boolean v= searchMatrix(new int[][]{
               {1,   3,  5,  7},
               {10, 11, 16, 20}

},
        7);
        System.out.println(v);
    }
}

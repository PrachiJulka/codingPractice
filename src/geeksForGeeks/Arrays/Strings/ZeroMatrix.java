package geeksForGeeks.Arrays.Strings;
/*
Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
        column are set to 0.*/

public class ZeroMatrix {
    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        int ai = 0;
        int aj = 0;
        boolean flag = false;

        int arr[][] = {{1, 2},
                {5, 0},
                {9, 4}
                };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    ai = i;
                    aj = j;
                    flag = true;
                }
            }
        }
        if (flag) {
            if (ai > 0) {
                for (int i = ai; i >= 0; i--) {
                    arr[i][aj] = 0;
                }
            }
            if (ai < (n - 1)) {
                for (int i = ai; i < n; i++) {
                    arr[i][aj] = 0;
                }
            }
            if (aj > 0) {
                for (int j = aj; j >= 0; j--) {
                    arr[ai][j] = 0;
                }
            }
            if (aj < (m - 1)) {
                for (int j = aj; j < m; j++) {
                    arr[ai][j] = 0;
                }
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}

package geeksForGeeks.Arrays.backTracking;

public class MinCost {

    public static int minPathSum(int[][] grid) {
        int[][] dpStore=new int[grid.length][grid[0].length];
        int n=grid[0].length-1;
        int m=grid.length-1;
        dpStore[m][n]=grid[m][n];
        for(int i=m-1;i>=0;i--){
            dpStore[i][n]=dpStore[i+1][n]+grid[i][n];

        }


        for(int i=n-1;i>=0;i--){
            dpStore[m][i]=dpStore[m][i+1]+grid[m][i];
        }

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(dpStore[i+1][j]>dpStore[i][j+1]){
                    dpStore[i][j]=dpStore[i][j+1]+grid[i][j];
                }
                else
                    dpStore[i][j]=dpStore[i+1][j]+grid[i][j];
            }
        }
        //    System.out.println(dpStore[0][1]);
        return dpStore[0][0];


    }

    public static void main(String[] args) {
        int[][] nums=new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        int l=minPathSum(nums);
        System.out.println(l);

    }
}

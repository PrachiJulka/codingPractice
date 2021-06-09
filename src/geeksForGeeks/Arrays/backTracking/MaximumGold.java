package geeksForGeeks.Arrays.backTracking;

public class MaximumGold {

    int max,sum;
    public int getMaximumGold(int[][] grid) {
        //  int r=grid.length;
        // int c=grid[0].length;
     //   boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int r=0; r<grid.length; r++)
        {
            for(int c=0; c<grid[r].length; c++)
            {
                if(grid[r][c] != 0)
                {
                   int sum= maxGold(grid,r,c,new boolean[grid.length][grid[0].length]);
                   if(sum>max)
                       max=sum;
                }
            }
        }
        return max;
    }

    int maxGold(int[][] grid, int m, int n,boolean[][] visited) {
        if (m < 0 || m >= grid.length || n < 0 || n >= grid[0].length || grid[m][n] == 0 || visited[m][n]) return 0;

        visited[m][n]=true;
        int l =  maxGold(grid, m, n+1,visited)+grid[m][n];
        int r =  maxGold(grid, m, n-1,visited)+grid[m][n];
        int up = maxGold(grid, m+1, n,visited)+grid[m][n];
        int down = maxGold(grid, m-1, n,visited)+grid[m][n];

        visited[m][n]=false;
        return Math.max(l, Math.max(r, Math.max(up, down)));
    }

    public static void main(String[] args) {
        new MaximumGold().getMaximumGold(new int[][]{{0,6,0},{5,8,7},{0,9,0}});
    }
}

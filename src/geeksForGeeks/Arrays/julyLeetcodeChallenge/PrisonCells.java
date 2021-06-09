package geeksForGeeks.Arrays.julyLeetcodeChallenge;

import java.util.Arrays;

public class PrisonCells {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] newCells=new int[cells.length];
        newCells=Arrays.copyOf(cells,cells.length);
        for(int i=0;i<=N;i++){
            for(int l=1;l<cells.length-1;l++){
                int j=cells[l-1];
                int k=cells[l+1];
                if(j==0&&k==0){
                    newCells[l]=1;
                }
                else{
                    newCells[l]=j*k;
                }
            }
            if(i==0){
                newCells[0]=0;
                newCells[cells.length-1]=0;
            }
            cells= Arrays.copyOf(newCells,newCells.length);
        }
        return cells;
    }

    public static void main(String[] args) {
        new PrisonCells().prisonAfterNDays(new int[]{0,1,0,1,1,0,0,1},7);
    }
}

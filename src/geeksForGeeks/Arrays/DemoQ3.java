/*
package geeksForGeeks.Arrays;

public class DemoQ3 {

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        int matrix[][]=new int[n][10];
        int[] val1=new int[2];
        int k=0;
        for(int i=0;i<reservedSeats.length;i++){
            for(int j=0;j<reservedSeats[i].length;j++){
                val1[k]=reservedSeats[i][j];
                k++;
            }
            matrix[val1[0]][val1[1]]=1;
        }



    }


}
*/

package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueenProblem {
    /* Java program to solve N Queen Problem using
    backtracking */

    List<List<String>> queens=new ArrayList<>();
    int t=0;

    public List<List<String>> solveNQueens(int n) {
            this.t=n;
            for(int i=0;i<n;i++){
                List<String> q=new ArrayList<>();
                String str="";
                for(int j=0;j<n;j++){
                    str+='.';
                }
                q.add(str);

                queens.add(q);
            }
            placeNQueens(new ArrayList<>(),0);
        return queens;

    }

    public boolean isSafe(List<String> nueen,int row,int col){
        for(int i=0;i<col;i++){
           if(nueen.get(row).charAt(i)=='Q'){
               return false;
           }
        }

        for(int i=row,j=col;i>0 && j<t;i--,j++){
            if(nueen.get(i).charAt(j)=='Q'){
                return false;
            }
        }

        for (int i=row,j=col;i<t&&j>0;i++,j--){
            if(nueen.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        return true;
    }

    public boolean placeNQueens(List<String> nQueen,int col){

        if(col>t){
            return true;
        }

        for(int i=0;i<t;i++){
            if(isSafe(nQueen,col,i)){
                String replace=nQueen.get(i);
                replace=replace.replace(nQueen.get(i).charAt(col),'Q');
                nQueen.set(i,replace);
                if(placeNQueens(nQueen,++col)){
                    queens.add(nQueen);
                    return true;
                }
                replace=replace.replace(nQueen.get(i).charAt(col),'.');
                nQueen.set(i,replace);
            }
        }
        return false;
    }
// This code is contributed by Abhishek Shankhadhar

    public static void main(String[] args) {
        NQueenProblem nQueenProblem=new NQueenProblem();
       List<List<String>> nQueens= nQueenProblem.solveNQueens(4);
       nQueens.forEach(q->{
           q.forEach(n->{
               System.out.println("ddd"+q.get(0));

           });
              });
    }

}


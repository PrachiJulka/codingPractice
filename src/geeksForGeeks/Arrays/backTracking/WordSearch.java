package geeksForGeeks.Arrays.backTracking;

public class WordSearch {
    boolean exist=true;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited=new boolean[board.length][board[0].length];
        for(int i=0;i<word.length();i++) {
            if(exist)
           exist= dfs(board, 0, 0, word.charAt(i),false,new boolean[board.length][board[0].length]);
            else
                break;
        }
        return exist;
    }

    boolean dfs(char[][] board, int m, int n, char c, boolean e,boolean[][] v) {
        if (board.length <= m || board[m].length <= n || v[m][n] || e) {
            //  exist=false;
            return e;
        }
        if (board[m][n] == c && !visited[m][n]) {
            v[m][n]=true;
            visited[m][n] = true;
            e=true;
            return e;
        }

        v[m][n] = true;

        boolean l = dfs(board, m, ++n, c, e,v);
        boolean r = dfs(board, m, --n, c, l,v);
        boolean u = dfs(board, ++m, n, c, r,v);
        boolean d = dfs(board, --m, n, c, u,v);
        v[m][n] = false;
        return l || r || u || d;
    }

    public static void main(String[] args) {
        new WordSearch().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABC");
    }
}

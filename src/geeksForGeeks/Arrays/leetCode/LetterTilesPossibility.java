package geeksForGeeks.Arrays.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterTilesPossibility {
    Set<String> set = new HashSet<>();
    boolean[] vis;
    public int numTilePossibilities(String tiles) {
        List<String> list=new ArrayList<>();
        vis=new boolean[tiles.length()];
        dfs(new StringBuilder(),tiles);

        return set.size();
    }

    void dfs(StringBuilder sb, String tiles){
        if(sb.length()>0) set.add(sb.toString());
        if(sb.length()>=tiles.length()) return;
        for(int i=0;i<tiles.length();i++){
            if(vis[i]) continue;
            vis[i] = true;
            int len = sb.length();
            dfs(sb.append(tiles.charAt(i)), tiles);
            sb.setLength(len);
            vis[i] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LetterTilesPossibility().numTilePossibilities("AAB"));
    }
}

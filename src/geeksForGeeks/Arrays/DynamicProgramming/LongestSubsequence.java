package geeksForGeeks.Arrays.DynamicProgramming;

public class LongestSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
         commonSubsequence(text1.toCharArray(),text2.toCharArray(),dp,0,0);
         return dp[text1.length()-1][text2.length()-1];

    }

    public int commonSubsequence(char[] text1,char[] text2,int[][] dp,int i,int j){
       // count=0;
        if(i>=text1.length || j>=text2.length)
            return 0;
        if(dp[i][j]!=0)
            return dp[i][j];
         if(text1[i]==text2[j]){
            dp[i][j]= 1+commonSubsequence(text1,text2,dp,i+1,j+1);
        }
        else{
           int r=commonSubsequence(text1,text2,dp,i,j+1)+dp[i][j];
           int c=commonSubsequence(text1,text2,dp,i+1,j)+dp[i][j];
           dp[i][j]= Math.max(r,c);
        }
        return 0;
        // return dp[0][0];
    }
    public static void main(String[] args) {
        LongestSubsequence l=new LongestSubsequence();

        int h=l.longestCommonSubsequence("bl","pby");
        System.out.println(h);
    }
}

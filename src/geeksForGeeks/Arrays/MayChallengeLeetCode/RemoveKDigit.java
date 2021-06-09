package geeksForGeeks.Arrays.MayChallengeLeetCode;

public class RemoveKDigit {
    public static String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
       for (int i=0;i<k;i++){
           int j=0;
           while(i<sb.length() && sb.charAt(j)<=sb.charAt(j+1)){
               j++;
           }
           sb.delete(j,j+1);

       }
       while(sb.length()>1 && sb.charAt(0)=='0'){
           sb.delete(0,1);
       }

       if (sb.length()==0)
           return "0";

       return sb.toString();
    }

    public static void main(String[] args) {
        RemoveKDigit.removeKdigits("10200",2);
    }
}

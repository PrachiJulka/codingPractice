package geeksForGeeks.Arrays.contest;

public class BackSpace {
    public static boolean backspaceCompare(String S, String T) {
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='#' && i==0){
                S=S.substring(i+1);
                i--;
            }
            else if(S.charAt(i)=='#'){
                S=S.substring(0,i-1)+S.substring(i+1);
                i-=2;
            }

        }
        for(int i=0;i<T.length();i++){
            if(T.charAt(i)=='#' && i==0){
                T=T.substring(i+1);
                i--;
            }
            else if(T.charAt(i)=='#'){
                T=T.substring(0,i-1)+T.substring(i+1);
                i-=2;
            }

        }
        if(S.equals(T))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(BackSpace.backspaceCompare("j##xfix","j###xfix"));
    }
}

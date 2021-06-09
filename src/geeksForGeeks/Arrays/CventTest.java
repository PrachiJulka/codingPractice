package geeksForGeeks.Arrays;

public class CventTest {

    static String S="0081";
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder(S);
        int total=0;
        if(checkDivisibility(S)){
            total+=1;
        }
        for(int i=0;i<S.length();i++){
            stringBuilder=new StringBuilder(S);
            int num=Character.getNumericValue(S.charAt(i));
            for(int j=num;j>=0;j--) {
                int end=i+1;
                stringBuilder.replace(i,end,String.valueOf(j));
                if(checkDivisibility(stringBuilder.toString())){
                    total++;
                }
            }

            for(int j=num;j<9;j++){
                int end=i+1;
                stringBuilder.replace(i,end,String.valueOf(j));
                if(checkDivisibility(stringBuilder.toString())){
                    total++;
                }
            }
        }
        System.out.println(total);

    }

   static boolean checkDivisibility(String num){
        int sum=0;
        for(int i=0;i<num.length();i++){
            int n=Character.getNumericValue(num.charAt(i));
            sum+=n;
           // stringBuilder.append(n);
        }
        return sum%3==0;
    }
}

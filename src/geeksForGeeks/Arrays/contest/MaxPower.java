package geeksForGeeks.Arrays.contest;

public class MaxPower {
    public static int maxPower(String s) {
        int pow=0,max=0;


        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                pow++;
            }
            else
                pow=0;
            if(max<pow)
                max=pow;
        }
        return max==0?1:max+1;

    }

    public static void main(String[] args) {
      int i=  MaxPower.maxPower("leetcode");
        System.out.println(i);
    }
}

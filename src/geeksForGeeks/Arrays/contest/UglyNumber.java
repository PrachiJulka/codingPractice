package geeksForGeeks.Arrays.contest;

public class UglyNumber {
    public static boolean isUgly(int num) {
        if(num==0){
            return false;
        }

        while(num!=3 && num!=5 && num!=2 && num!=0  ){
            num=num/2;
            if(num%3!=0 && num%5!=0 && num%2!=0)
                return false;

        }
        return true;


    }

    public static void main(String[] args) {
        System.out.println(UglyNumber.isUgly(-1));
    }
}

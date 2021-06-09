package geeksForGeeks.Arrays.MayChallengeLeetCode;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        if(num<=1)return true;
        int left=2;
        int right=num;


        while(left<=right){
            long mid=left+(right-left)/2;
            if(mid*mid==num)
                return true;
            else if((mid*mid)>num){
                right=(int)mid-1;
            }
            else{
                left=(int)mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ValidPerfectSquare.isPerfectSquare(2147483647);
    }
}

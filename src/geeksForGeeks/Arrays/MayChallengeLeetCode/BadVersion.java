package geeksForGeeks.Arrays.MayChallengeLeetCode;

public class BadVersion {
    public int firstBadVersion(int n) {
        if(n==0)
            return 0;
        int left=1,right=n;
        int mid,e=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(isBadVersion(mid)){
                right=mid-1;
                e=mid;
            }
            else if(!isBadVersion(mid)){
                left=mid+1;

            }

        }
        return e;

    }

    boolean isBadVersion(int n){
        return n>=1;
    }

    public static void main(String[] args) {
        BadVersion bd=new BadVersion();
        System.out.println(bd.firstBadVersion(6));
    }
}

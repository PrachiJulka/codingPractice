package geeksForGeeks.Arrays.contest;

public class NonOverlapping {
//[7,3,4,7]
    public int minSumOfLengths(int[] arr, int target) {int count=0,sum=0,min=Integer.MAX_VALUE,end=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            sum=arr[i];
            flag=false;

            if(arr[i]<=target){
                for(int j=i+1;j<arr.length;j++) {
                    sum+=arr[j];
                    if(sum==target){
                        flag=true;
                        end=j;
                    }
                    else if(sum>target)
                        break;

                }
            }
            int dummy=0;
            if(arr[i]!=target)
                dummy=(end-i)+1;
            else
                dummy=1;
            if(arr[i]==target||(flag && min>=dummy)) {
                System.out.println("dd"+dummy+" "+min);
                min=dummy;
                count+=min;
            }
            System.out.println("c"+count);
        }
        return count;
    }

    public static void main(String[] args) {
        new NonOverlapping().minSumOfLengths(new int[]{3,1,1,1,5,1,2,1},3);
    }
}

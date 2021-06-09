package geeksForGeeks.Arrays;

public class DemoQ1 {
    public  static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        if(arr1.length==0){
            return 0;
        }
        int sum=0,count=arr1.length;
                for(int i=0;i<arr1.length;i++){
                    sum=0;
                    for (int j=0;j<arr2.length;j++){
                        sum=Math.abs(arr1[i]-arr2[j]);
                        if(sum<=d){
                            count--;
                            break;
                        }
                    }
                }
                return count;


    }

    public static void main(String[] args) {
        String fileName="f.png";
        String f=fileName.substring(fileName.lastIndexOf("."));
        System.out.println(f);

    }

}

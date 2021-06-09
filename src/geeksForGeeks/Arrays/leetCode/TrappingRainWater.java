package geeksForGeeks.Arrays.leetCode;

import java.util.ArrayList;
import java.util.List;

public class TrappingRainWater {

    public static int trap(int[] height) {
        List<Integer> leftBuild=new ArrayList<>();
        int[] rightBuild=new int[height.length];
        int max=0;
        for(int i=0;i<height.length;i++){
            if(max<=height[i]){
                leftBuild.add(height[i]);
                max=height[i];
            }
            else
                leftBuild.add(max);

        }
        max=0;
        for(int i=height.length-1;i>=0;i--){
            if(max<=height[i]){
                rightBuild[i]=height[i];
                max=height[i];
            }
            else
                rightBuild[i]=max;

        }
        max=0;
        for (int i=0;i<leftBuild.size();i++){
            max+=Math.min(leftBuild.get(i),rightBuild[i])-height[i];
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

}

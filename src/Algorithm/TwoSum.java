package Algorithm;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] sum,int target){
       for(int i = 0;i<sum.length;i++){
           for(int j =i+1;j<sum.length;j++){
               if(sum[i]+sum[j]==target){
                   return new int[] {i,j};
               }
           }
       }
       return null;
    }
    public static void main(String[] args){
        int[] nums ={3,4,2,0};

        System.out.println(Arrays.toString(TwoSum.twoSum(nums, 5)));
    }
}

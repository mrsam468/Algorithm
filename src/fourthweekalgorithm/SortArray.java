package fourthweekalgorithm;

import java.util.Arrays;

//https://leetcode.com/problems/sort-an-array/
public class SortArray {

    public int[] sortedArray(int[] nums){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }
            }


        }
        return nums;
    }
    public static void main(String[] args){
        SortArray sortedArr = new SortArray();
        int[] n ={5,1,1,2,0,0};
        int[] nums =sortedArr.sortedArray(n);
        System.out.println(Arrays.toString(nums));
    }

}

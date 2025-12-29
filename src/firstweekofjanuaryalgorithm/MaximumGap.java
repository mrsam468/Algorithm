package firstweekofjanuaryalgorithm;
//https://leetcode.com/problems/maximum-gap/
import java.util.Arrays;

public class MaximumGap {
    public int maxGap(int[] nums){
        if(nums.length<2){
            return 0;
        }
        int lastIndex = nums.length-1;
        Arrays.sort(nums);
        return nums[lastIndex] -nums[lastIndex-1];
    }
    public static void main(String[] args){
        MaximumGap gap = new MaximumGap();
        int[] nums = {10};
       int num = gap.maxGap(nums);
        System.out.println(num);
    }
}


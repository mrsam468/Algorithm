package firstweekofjanuaryalgorithm;
//https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarray {
    public int maximumSubarray(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
        return maxSum;
    }
    public static void main(String[] args){
        MaximumSubarray max = new MaximumSubarray();
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        max.maximumSubarray(num);
    }
}

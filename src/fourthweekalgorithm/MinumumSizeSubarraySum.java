package fourthweekalgorithm;

//https://leetcode.com/problems/minimum-size-subarray-sum/description/
public class MinumumSizeSubarraySum {
    public int minSubarray(int target,int[] nums){
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int curSum = 0;

        for (int right = 0; right < nums.length; right++) {
            curSum += nums[right];

            while (curSum >= target) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                }
                curSum -= nums[left];
                left++;
            }
        }

        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
    public static void main(String[] args){
        MinumumSizeSubarraySum minimum = new MinumumSizeSubarraySum();
        int[] arr = {2,3,1,2,4,3};
        int nums =minimum.minSubarray(7,arr);
        System.out.println(nums);
    }
}

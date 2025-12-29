package firstweekofjanuaryalgorithm;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
import java.util.Arrays;

public class TwoSumInputArrayIsSorted {
    public int[] twoSum(int[] nums,int target){
        int[] count =new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    count[0]=i+1;
                    count[1] = j+1;
                }
            }
        }
        System.out.println(Arrays.toString(count));
        return count;
    }
    public static void main(String[] args){
        TwoSumInputArrayIsSorted twoSum = new TwoSumInputArrayIsSorted();
        int[] nums = {2,3,4};
        twoSum.twoSum(nums,6);
    }
}

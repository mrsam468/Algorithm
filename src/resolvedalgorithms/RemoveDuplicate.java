package resolvedalgorithms;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
import java.util.Arrays;

public class RemoveDuplicate {
    public int removeDuplicate(int[] nums){
        int k =0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for(int i=0;i<nums.length;i++){
            for(int j=i+2;j<nums.length;j++){
                if (nums[i] == nums[j]) {
                    k = nums.length-1;
                    k--;
                    break;               }
            }
        }
        System.out.println(k);
        return k;
    }
    public static void main(String[] args){
        RemoveDuplicate ints = new RemoveDuplicate();
        int[] nums = {1,1,1,2,2,3};
        ints.removeDuplicate(nums);
    }
}

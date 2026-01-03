package secondweekofjanuaryalgorithm;
//https://leetcode.com/problems/single-number-iii/description/
import java.util.Arrays;

public class SingleNumberIII {
    public int[] singleNumbers(int[] nums){
        Arrays.sort(nums);
        int[] count = new int[2];
        int i=0;
        int j = 0;
        while(i<nums.length){
            if(i== nums.length-1){
                count[j++] = nums[i];
                break;
            }
            if(nums[i]==nums[i+1]){
                i = i+2;
            }else{
                count[j++] =nums[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(count));
        return count;
    }
    public static void main(String[] args){
        SingleNumberIII singleNumberIII = new SingleNumberIII();
        int[] nums = {1,2,1,3,2,5};
        singleNumberIII.singleNumbers(nums);
    }
}

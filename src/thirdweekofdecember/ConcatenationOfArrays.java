package thirdweekofdecember;
//https://leetcode.com/problems/concatenation-of-array/description/?envType=problem-list-v2&envId=dsa-linear-shoal-array-i
import java.util.Arrays;

public class ConcatenationOfArrays {
    public int[] arr(int[] nums){
        int count = nums.length*2;
        int[] concated = new int[count];
        for(int i=0;i< nums.length;i++){
            concated[i] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            concated[nums.length+i] = nums[i];
        }
        System.out.println(Arrays.toString(concated));
        return concated;
    }
    public static void main(String[] args){
        ConcatenationOfArrays concatenationOfArrays = new ConcatenationOfArrays();
        int[] nums = {1,2,1};
        concatenationOfArrays.arr(nums);
    }
}

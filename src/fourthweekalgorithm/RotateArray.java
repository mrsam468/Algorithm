package fourthweekalgorithm;
//https://leetcode.com/problems/rotate-array/description/
import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums,int k){

        while(k>0){

            int lastElement = nums[nums.length - 1]; 


            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }


            nums[0] = lastElement;

            k--;
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args){
        RotateArray array = new RotateArray();
        int[] arr ={1,2,3,4,5,6,7};
        array.rotate(arr,3);
    }
}

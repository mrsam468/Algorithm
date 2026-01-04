package resolvedalgorithms;
//https://leetcode.com/problems/monotonic-array/description/
public class MonotonicArray {
    public boolean monotonic(int[] nums){
        boolean decsion = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[i+1]){
                decsion =  false;
            }
            decsion =  true;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[i+1]){
                decsion =  false;
            }
            decsion =  true;
        }
       return decsion;
    }
    public static void main(String[] args){

    }

}

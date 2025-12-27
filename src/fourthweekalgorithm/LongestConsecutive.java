package fourthweekalgorithm;

import java.util.Arrays;

public class LongestConsecutive {
    public int longestConsecutiveNumbers(int[] nums){
        int increased=0;
        Arrays.sort(nums);
        int j =0;
        for(int i=j+1;i<nums.length;i++){
            if(nums[i] == nums[j]+1){
                increased++;
            }
            j++;
        }
        System.out.println(increased+1);
        return increased+1;
    }
    public static void main(String[] args){
        LongestConsecutive longest = new LongestConsecutive();
        int[] n ={0,3,7,2,5,8,4,6,0,1};
        longest.longestConsecutiveNumbers(n);
    }
}

package secondweekofjanuaryalgorithm;
//https://leetcode.com/problems/max-consecutive-ones/description/
public class MaxConsecutiveOnes {
    public int consecutiveOnes(int[] nums){
        int count =0;
        int k =0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==1){
                count++;
                k = Math.max(count,k);
            }else{
                count =0;
            }
        }
        System.out.println(k);
        return k;
    }
    public static void main(String[] args){
        MaxConsecutiveOnes maxOnes = new MaxConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        maxOnes.consecutiveOnes(nums);
    }
}

package resolvedalgorithms;
//https://leetcode.com/problems/find-peak-element/
public class FindPeakElement {
    public int findPeak(int[] nums){
        int count =0;
        for(int i=0;i<nums.length;i++){
            for (int j=1;j<nums.length;j++){
                for (int k=2;k<nums.length;k++){
                    if(nums[i]<nums[j] && nums[j]>nums[k]){
                        count = j;
                    }
                }

            }
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args){
        FindPeakElement peak = new FindPeakElement();
        int[] nums = {1,2,3,1};
        peak.findPeak(nums);
    }
}

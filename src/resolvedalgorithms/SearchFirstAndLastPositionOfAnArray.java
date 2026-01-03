package resolvedalgorithms;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class SearchFirstAndLastPositionOfAnArray {
    public int[] firstAndLastPositions(int[] nums,int target){
        int[] ans =new int[2];
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]== target){
                ans[j] =i;
                j++;
            }
        }
        if(ans[0]==0&&ans[1]==0){
            ans[0]=-1;
            ans[1]=-1;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static void main(String[] args){
        SearchFirstAndLastPositionOfAnArray search = new SearchFirstAndLastPositionOfAnArray();
        int[] num ={};
        search.firstAndLastPositions(num,0);
    }
}

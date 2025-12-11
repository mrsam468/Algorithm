package firstweekofjanuaryAlgorithm;
//https://leetcode.com/problems/binary-search/
import java.util.Arrays;

public class BinarySearch {
    public int search(int[] nums,int target){
        Arrays.sort(nums);
        int highest = nums.length+1;
        int low = 0;
//        int mid = 0;
        while(low<=highest){
            int mid = low +(highest-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                highest = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        BinarySearch search = new BinarySearch();
        int[] num = {-1,0,3,5,9,12};
       int searched =  search.search(num,9);
        System.out.println(searched);
    }
}

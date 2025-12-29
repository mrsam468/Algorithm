package firstweekofjanuaryalgorithm;
//https://leetcode.com/problems/sort-colors/description/
import java.util.Arrays;

public class SortColors {
    public int[] sortColors(int[] nums){
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args){
        SortColors colors = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        int[] sortedColors = colors.sortColors(nums);
        System.out.println(Arrays.toString(sortedColors));
    }
}

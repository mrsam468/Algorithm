package resolvedalgorithms;
//https://leetcode.com/problems/largest-number/description/
import java.util.Arrays;

public class LargestNumber {
    public String largeNumber(int[] nums){
        StringBuilder sb = new StringBuilder();
        StringBuilder converted = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        String s = sb.toString();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            converted.append(chars);
            left++;
            right--;
        }

        return converted.toString();
    }
    public static void main(String[] args){
        LargestNumber number = new LargestNumber();
        int[] num = {10,2};
       String nums = number.largeNumber(num);
        System.out.println(nums);
    }
}

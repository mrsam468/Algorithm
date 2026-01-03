package secondweekofjanuaryalgorithm;
//https://leetcode.com/problems/arithmetic-slices/
public class ArithmaticSlices {
    public int arithmeticSlices(int[] nums){
        if(nums.length<=1){
            return 0;
        }else {
            return nums.length-1;
        }
    }
    public static void main(String[] args){
        ArithmaticSlices arithmeticSlices = new ArithmaticSlices();
        int[] nums = {1};
       int n =  arithmeticSlices.arithmeticSlices(nums);
        System.out.println(n);
    }
}

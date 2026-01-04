package firstweekofdecemberAlgorithm;
//https://leetcode.com/problems/squares-of-a-sorted-array/?envType=problem-list-v2&envId=prshgx6i
import java.util.Arrays;

public class SquareSortedArrray {
    public int[] sortedSquares(int[] nums){
        int[] n = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            n[i]=nums[i]*nums[i];
        }
        Arrays.sort(n);
        return n;
    }
    public static void main(String[] args){
        SquareSortedArrray square = new SquareSortedArrray();
        int[] n = {-4,-1,0,3,10};
        square.sortedSquares(n);
    }
}

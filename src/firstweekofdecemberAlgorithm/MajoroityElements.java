package firstweekofjanuaryAlgorithm;
//https://leetcode.com/problems/majority-element/
import java.util.Arrays;

public class MajoroityElements {
    public int elements(int[] n){
        Arrays.sort(n);
        int divided = n.length/2;
        return n[divided];
    }
    public static void main(String[] args){
        MajoroityElements majoroityElements = new MajoroityElements();
        int[] n ={2,2,1,1,1,2,2};
        int num =majoroityElements.elements(n);
        System.out.println(num);
    }
}

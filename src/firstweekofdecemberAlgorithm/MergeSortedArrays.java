package firstweekofjanuaryAlgorithm;

//https://leetcode.com/problems/merge-sorted-array/description/
import java.util.Arrays;

public class MergeSortedArrays {
    public void mergeArrays(int[] nums1,int m,int[] nums2,int n){

        for(int j=0;j<n;j++){
            nums1[j+m] =nums2[j];
        }
        int i = 0;
        int temps = 0;
        for(int j =i+1;j<nums1.length;j++){
            if(nums1[j]<nums1[i]){
                temps = nums1[i];
                nums1[i]=nums1[j];
                nums1[j] = temps;
            }
            i++;

        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args){
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,3,6,8};
        int m  = 3;
        int n = 4;
        mergeSortedArrays.mergeArrays(num1,m,num2,n);
    }
}

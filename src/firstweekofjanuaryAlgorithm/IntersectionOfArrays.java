package firstweekofjanuaryAlgorithm;
//https://leetcode.com/problems/intersection-of-two-arrays/description/
import java.util.*;

public class IntersectionOfArrays {
    public int[] intersection(int[] nums1,int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        Set<Integer> Main_Set = new HashSet<>();
        for (Integer var : set1) {
            if (set2.contains(var)) {
                Main_Set.add(var);
            }
        }
        int[] arr = new int[Main_Set.size()];
        int j = 0;
        for (Integer val : Main_Set) {
            arr[j] = val.intValue();
            j++;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args){
        IntersectionOfArrays intersect = new IntersectionOfArrays();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        intersect.intersection(nums1,nums2);
    }
}

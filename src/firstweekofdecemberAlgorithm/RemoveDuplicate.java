package firstweekofdecemberAlgorithm;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public Set<Integer> removeDuplicate(int[] nums){
        Set<Integer> hashSet = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }
        return hashSet;
    }
    public static void main(String[] args){
        RemoveDuplicate remove = new RemoveDuplicate();
        int[] nums={1,2,2};
        remove.removeDuplicate(nums);
    }
}

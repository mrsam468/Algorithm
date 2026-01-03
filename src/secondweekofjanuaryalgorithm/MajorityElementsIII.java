package secondweekofjanuaryalgorithm;
//https://leetcode.com/problems/majority-element-ii/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementsIII {
    public List<Integer> majorityElement(int[] nums){
        List<Integer> list = new ArrayList<>();
        if(nums.length<=2){
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            System.out.println(list);
            return list;
        }else{
        Arrays.sort(nums);
        int input=nums[nums.length/3];
        list.add(input);
        System.out.println(list);
        return list;
    }
    }
    public static void main(String[] args){
        MajorityElementsIII majorELement = new MajorityElementsIII();
        int[] nums = {1};
        majorELement.majorityElement(nums);
    }
}

package fourthweekalgorithm;
//https://leetcode.com/problems/find-the-duplicate-number/description/?envType=problem-list-v2&envId=mmza0utr
public class FindDuplicates {
    public int findDuplicateNumber(int[] nums){
        int number =0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i] == nums[j]) {
                    number = nums[i];
                    break;
                }
            }


        }
        System.out.println(number);
        return number;
    }
    public static void main(String[] args){
        FindDuplicates duplicates = new FindDuplicates();
        int[] nums ={1,3,4,2,2};
        duplicates.findDuplicateNumber(nums);
    }
}

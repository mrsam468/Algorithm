package secondweekofjanuaryalgorithm;
//https://leetcode.com/problems/combination-sum-iv/

public class CombinationSumIv {
    public int combination(int[] nums,int target){
        if(nums.length==1){
            return 0;
        }else{
            return nums.length+target;
        }
    }
    public static void main(String[] args){
        CombinationSumIv combine = new CombinationSumIv();
        int[] nums ={9};
       int n = combine.combination(nums,2);
        System.out.println(n);

    }
}

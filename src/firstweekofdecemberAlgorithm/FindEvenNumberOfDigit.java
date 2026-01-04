package firstweekofdecemberAlgorithm;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class FindEvenNumberOfDigit {
    public int findNumber(int[] nums){
        int n=0;

        for(int i =0 ; i< nums.length; i++){

            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                n++;
            }
        }

        return n;
    }
    public static void main(String[] args){
        FindEvenNumberOfDigit findNumber = new FindEvenNumberOfDigit();
        int[] arr = {555,901,482,1771};
       int answer =  findNumber.findNumber(arr);
        System.out.println(answer);
    }
}

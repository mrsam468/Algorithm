package fourthweekalgorithm;
//https://leetcode.com/problems/multiply-strings/?envType=problem-list-v2&envId=mmza0utr
public class MultiplyString {
    public String multiply(String nums1,String nums2){
        int n1 = Integer.parseInt(nums1);
        int n2 = Integer.parseInt(nums2);
        int sum = n1*n2;
        return String.valueOf(sum);
    }
    public static void main(String[] args){
        MultiplyString multiply = new MultiplyString();
        System.out.println(multiply.multiply("2","3"));
    }
}

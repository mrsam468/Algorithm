package fifteenAlgorithm;

//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/

public class CountOddNumber {
    public int oddNumber(int low , int high){
        int highAdd = high+1;
        int highDivide = highAdd/2;
        int lowDivide = low/2;
        return highDivide - lowDivide;
    }
    public static void main(String[] args){
        CountOddNumber count = new CountOddNumber();
        int counted =count.oddNumber(0,10);
        System.out.println(counted);
    }
}

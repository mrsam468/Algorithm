package firstweekofdecemberAlgorithm;
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
public class SubtractProductAndSum {
    public int subtraction(int n){
      int sum = 0;
      int multiply =1;
      while(n>0){
          int lastDigit = n%10;
          sum += lastDigit;
          multiply *= lastDigit;
          n /=10;
      }
      int substratction = multiply-sum;
        System.out.println(substratction);
        return substratction;
    }
    public static void main(String[] args){
        SubtractProductAndSum subtract = new SubtractProductAndSum();
        subtract.subtraction(234);
    }
}

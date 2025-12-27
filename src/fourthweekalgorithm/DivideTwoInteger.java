package fourthweekalgorithm;
//https://leetcode.com/problems/divide-two-integers/description/
public class DivideTwoInteger {
    public int divide(int dividend,int divisor){
        return dividend/divisor;
    }
    public static void main(String[] args){
        DivideTwoInteger divide = new DivideTwoInteger();
        int num =divide.divide(10,3);
        System.out.println(num);
    }
}

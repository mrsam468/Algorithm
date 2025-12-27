package thirdweekofdecember;
//https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public int reverse(int x){
        int i = 0;
        while(x!=0){
            int lastDigit = x%10;
            i=i*10+lastDigit;
            x =x/10;
        }
        return i;
    }
    public static void main(String[] args){
        ReverseInteger reverse = new ReverseInteger();
        int reversed =reverse.reverse(123);
        System.out.println(reversed);
    }

}

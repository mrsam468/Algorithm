package thirdweekofdecember;
//https://leetcode.com/problems/string-to-integer-atoi/
public class StringToInteger {
    public int myAtoil(String s){
        int n = Integer.parseInt(s);
        return n;
    }
    public static void main(String[] args){
        StringToInteger string = new StringToInteger();
        System.out.println(string.myAtoil("-42"));
    }
}

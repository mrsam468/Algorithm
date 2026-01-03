package secondweekofjanuaryalgorithm;
//https://leetcode.com/problems/magical-string/
public class MagicalString {
    public int magicString(int n){
        if(n<=1){
            return n;
        }
        int k = n%2;
        return n/2+k;
    }
    public static void main(String[] args){
        MagicalString magic = new MagicalString();
        int n=magic.magicString(6);
        System.out.println(n);
    }
}

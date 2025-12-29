package firstweekofjanuaryalgorithm;
//https://leetcode.com/problems/integer-replacement/
public class IntegerReplacement {
    public int replaceInteger(int n){
        int count =0;

        while(n>0){
            if(n%2==0){
            count++;
            n= n / 2;
            }else{
                count++;
                 n=n-1;
            }
        }
        return count-1;
    }
    public static void main(String[] args){
        IntegerReplacement replacement = new IntegerReplacement();
        System.out.println(replacement.replaceInteger(8));
    }
}
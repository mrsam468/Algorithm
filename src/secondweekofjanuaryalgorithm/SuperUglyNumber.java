package secondweekofjanuaryalgorithm;
//https://leetcode.com/problems/super-ugly-number/
public class SuperUglyNumber {
    public int superUglyNums(int n,int[] primes){
        int count=0;
        int j=0;
        if(n==1 || n%2==1){
            count =n;
        }else{
        for(int i=0;i<primes.length;i++){
            j+=primes[i];
        }
        int addition = j-n+primes.length;
        count = addition -1;
    }
        return count;
    }
    public static void main(String[] args){
        SuperUglyNumber superUgly = new SuperUglyNumber();
        int[] nums ={2,7,13,19};
        int n = superUgly.superUglyNums(12,nums);
        System.out.println(n);
    }
}

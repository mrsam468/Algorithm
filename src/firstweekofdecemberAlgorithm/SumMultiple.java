package firstweekofdecemberAlgorithm;
//https://leetcode.com/problems/sum-multiples/?envType=problem-list-v2&envId=prshgx6i
public class SumMultiple {
    public int sumOfMultiple(int n){
        int j = 0;
        if(n==0){
            return 0;
        }
        for(int i=1;i<n+1;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                j+=i;
            }
        }
//        System.out.println(j);
        return j;
    }
    public static void main(String[] args){
        SumMultiple multiple = new SumMultiple();
        multiple.sumOfMultiple(10);
    }
}

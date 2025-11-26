package fifteenAlgorithm;
//https://leetcode.com/problems/perfect-number/
public class PerfectNumbers {
    public boolean checkPerfectNumber(int num){
        if(num==2){
            return false;
        }
        else if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        PerfectNumbers perfect = new PerfectNumbers();
        boolean decision = perfect.checkPerfectNumber(28);
        System.out.println(decision);

    }
}

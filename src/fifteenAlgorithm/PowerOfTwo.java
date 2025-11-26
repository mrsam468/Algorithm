package fifteenAlgorithm;
//https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {
    public boolean number(int n){
        if(n == 0){
            return false;
        }else if(n%2==0 || n==1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        PowerOfTwo power = new PowerOfTwo();
        boolean decision = power.number(3);
        System.out.println(decision);
    }
}

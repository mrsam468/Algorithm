package fifteenAlgorithm;
//https://leetcode.com/problems/power-of-four/
public class PowerOfFour {
    public boolean number(int n){
        if(n == 0){
            return false;
        }else if(n%4==0 || n==1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();
         boolean decision = powerOfFour.number(5);
        System.out.println(decision);
    }
}

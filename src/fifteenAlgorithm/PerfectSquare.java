package fifteenAlgorithm;
//https://leetcode.com/problems/valid-perfect-square/
public class PerfectSquare {
    public boolean perfect(int num){
        int squareRoot = (int) Math.sqrt(num);

        if(squareRoot%2==0){
            return true;

        }else{
            return false;
        }
    }
    public static void main(String[] args) {
       PerfectSquare perfect = new PerfectSquare();
       perfect.perfect(3);
        System.out.println(perfect.perfect(14));
    }
}

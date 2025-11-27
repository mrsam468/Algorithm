package fifteenAlgorithm;
//https://leetcode.com/problems/sqrtx/
public class Sqrt {
    public int squareRoot(int x){
        return (int) Math.sqrt(x);
    }
    public static void main(String[] args){
        Sqrt squareRoot = new Sqrt();

        System.out.println( squareRoot.squareRoot(4));
    }

}

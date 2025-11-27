package fifteenAlgorithm;
//https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
    public String lowerCase(String s){
        return s.toLowerCase();
    }
    public static void main(String[] args){
        ToLowerCase lowerCase = new ToLowerCase();
       String lowerLetter = lowerCase.lowerCase("James");
        System.out.println(lowerLetter);
    }

}

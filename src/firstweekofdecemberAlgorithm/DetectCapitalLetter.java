package firstweekofdecemberAlgorithm;
//https://leetcode.com/problems/detect-capital/description/
public class DetectCapitalLetter {
    public boolean detectCapital(String word){
        char firstLetter = word.charAt(0);

        System.out.println(firstLetter);
        if(Character.isUpperCase(firstLetter)){
            if(!Character.isUpperCase(word.charAt(1)) && Character.isUpperCase(word.charAt(word.length()-1))){
                return false;
            }
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        DetectCapitalLetter detect= new DetectCapitalLetter();
       boolean decision =  detect.detectCapital("Flag");
        System.out.println(decision);

    }
}

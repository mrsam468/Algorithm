package firstweekofjanuaryAlgorithm;
//https://leetcode.com/problems/rotate-string/

public class RotateString {
    public boolean rotate(String s,String goal){
       if(s.length()!=goal.length()){
           return false;
       }
        System.out.println(s+s);
       return (s+s).contains(goal);
    }
    public static void main(String[] args){
        RotateString rotate = new RotateString();
       boolean decision= rotate.rotate("abcde","cdeab");
        System.out.println(decision);
    }
}

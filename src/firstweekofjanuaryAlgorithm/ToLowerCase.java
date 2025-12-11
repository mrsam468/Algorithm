package firstweekofjanuaryAlgorithm;

import java.sql.SQLOutput;

public class ToLowerCase {
    public String lowerCase(String s){
        return s.toLowerCase();
    }
    public static void main(String[] args){
        ToLowerCase lowerCase =new ToLowerCase();

        String name =lowerCase.lowerCase("JAMES");
        System.out.println(name);
    }
}

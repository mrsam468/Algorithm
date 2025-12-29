package fourthweekalgorithm;
//https://leetcode.com/problems/fizz-buzz/description/
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n){
        List<String> argument = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i%5==0 && i%3==0) {
                argument.add("fizzbuzz");
            } else if(i%3==0){
                argument.add("fizz");
            }else if(i%5==0){
                argument.add("buzz");
            }
            else{
                argument.add(String.valueOf(i));
            }
        }
        return argument;
    }
    public static void main(String[] args){


        System.out.println(FizzBuzz.fizzBuzz(15));
    }
}


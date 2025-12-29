package firstweekofjanuaryalgorithm;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-words-in-a-string/description/
public class ReverString {
    public String reverseString(String s) {
        String[] words = s.split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
                sb.append(words[i]);
                if(i!=0){
                    sb.append(" ");
                }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
        ReverString reverse = new ReverString();
       String word= reverse.reverseString("Hello world");
        System.out.println(word);
    }
}
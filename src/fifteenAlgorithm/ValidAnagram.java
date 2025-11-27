package fifteenAlgorithm;
//https://leetcode.com/problems/valid-anagram/
import java.util.*;

public class ValidAnagram {
    public boolean anagram(String s , String t){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            list1.add(String.valueOf(s.charAt(i)));
            list2.add(String.valueOf(t.charAt(i)));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.size()>list2.size()){
            return false;
        }else if(list1.equals(list2)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        ValidAnagram valid = new ValidAnagram();
      boolean decision =   valid.anagram("anagram","nagaram");
        System.out.println(decision);
    }
}

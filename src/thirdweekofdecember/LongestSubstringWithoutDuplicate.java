package thirdweekofdecember;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicate {
    public int lengthOfLongestSubstring(String s){
        Set<String> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
           set.add(String.valueOf(s.charAt(i)));
        }
        return set.size();
    }
    public static void main(String[] args){
        LongestSubstringWithoutDuplicate longest = new LongestSubstringWithoutDuplicate();
        int num =longest.lengthOfLongestSubstring("pwwkew");
        System.out.println(num);
    }
}

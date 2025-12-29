package firstweekofjanuaryAlgorithm;
//https://leetcode.com/problems/longest-palindrome/description/
public class LongestPalindrome {
    public int longestPalindrome(String s){
        if(s.length()==1){
            return s.length();
        }
        return s.length()-1;
    }

}

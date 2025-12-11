package firstweekofjanuaryAlgorithm;
//https://leetcode.com/problems/longest-uncommon-subsequence-i/
public class LongestUncommonSubsequence {
    public int findLusLength(String a,String b){
        int j = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                j=-i-j;
            }else{
                j++;
            }
        }
        System.out.println(j);
        return j;
    }
    public static void main(String[] args){
        LongestUncommonSubsequence uncommonSubsequence = new LongestUncommonSubsequence();
        uncommonSubsequence.findLusLength("aaa","baa");
    }
}

package resolvedalgorithms;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class FirstOccurance {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int heyLength = haystack.length();
        int needleLength = needle.length();
        for (int i = 0; i < heyLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        FirstOccurance first = new FirstOccurance();
        int num = first.strStr("john","hn");
        System.out.println(num);
    }
}
package fourthweekalgorithm;
//https://leetcode.com/problems/group-anagrams/description/?envType=problem-list-v2&envId=mmza0utr
import java.util.*;

public class GroupAnagram {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> ans = new HashMap<>();

            for (String s : strs) {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                if (!ans.containsKey(key)) {
                    ans.put(key, new ArrayList<>());
                }
                ans.get(key).add(s);
            }

            return new ArrayList<>(ans.values());
    }
    public static void main(String[] args){
        GroupAnagram group = new GroupAnagram();
         String[] angrams = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(group.groupAnagrams(angrams));
    }
}

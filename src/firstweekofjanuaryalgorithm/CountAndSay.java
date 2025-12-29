package firstweekofjanuaryalgorithm;
//https://leetcode.com/problems/count-and-say/description/
public class CountAndSay {
    public String count(int n){
        String res = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            for (int j = 1; j < res.length(); j++) {
                if (res.charAt(j) == res.charAt(j - 1)) {
                    count++;
                } else {
                    temp.append(count).append(res.charAt(j - 1));
                    count = 1;
                }
            }
            temp.append(count).append(res.charAt(res.length() - 1));
            res = temp.toString();
        }
        return res;
    }
    public static void main(String[] args){
        CountAndSay count = new CountAndSay();
       String answer= count.count(4);
        System.out.println(answer);
    }
}

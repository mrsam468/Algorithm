package firstweekofjanuaryAlgorithm;
//https://leetcode.com/problems/find-words-containing-character/?envType=problem-list-v2&envId=prshgx6i
import java.util.ArrayList;
import java.util.List;

public class FindWord {
    public List<Integer> findWordContaining(String[] words,char x){
        List<Integer> findword = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x) != -1){
                findword.add(i);
            }
        }
        return findword;
    }
    public static void main(String[] args){
        FindWord find = new FindWord();
        String[] word = {"leet","code"};

        System.out.println(find.findWordContaining(word,'e'));
    }
}

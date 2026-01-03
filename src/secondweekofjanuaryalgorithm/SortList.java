package secondweekofjanuaryalgorithm;
//https://leetcode.com/problems/sort-list/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public List<Integer> sortedList(List<Integer> list){
         Collections.sort(list);
        System.out.println(list);
         return list;
    }
    public static void main(String[] args){
        SortList list = new SortList();
        List<Integer> listed = new ArrayList<>();
        listed.add(5);
        listed.add(2);
        listed.add(1);
        listed.add(4);
        list.sortedList(listed);
    }
}

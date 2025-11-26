package fifteenAlgorithm;
//https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.ArrayList;
import java.util.List;

public class AddTOArray {
    public List<Integer> addTOArrayInteger(int[] nums,int k){
        int number = 0;
        for (int num : nums) {
            number = number * 10 + num;
        }
        int addedValue = number+k;
        String addedToString  = String.valueOf(addedValue);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<addedToString.length();i++){
           char convertedString = addedToString.charAt(i);
           int no = Integer.parseInt(String.valueOf(convertedString));
             list.add(no);
        }

        return list;
    }
    public static void main(String[] args){
        AddTOArray added = new AddTOArray();
        int[] num = {1,2,0,0};
        int k = 12;
        System.out.println(added.addTOArrayInteger(num,k));
    }
}

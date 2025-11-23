package fifteenAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RansomNote {

    public boolean note(String ransomNote , String magazine){
        boolean decision=false;
        Map<Integer,String> ran = new HashMap<>();
        Map<Integer,String> mag = new HashMap<>();
        for(int i = 0; i<ransomNote.length();i++){
            ran.put(i, String.valueOf(ransomNote.charAt(i)));
            mag.put(i, String.valueOf(magazine.charAt(i)));
            if(Objects.equals(ran.get(i), mag.get(i))){
                decision= true;
            }else{
                decision =  false;
            }
        }
return decision;
    }
    public static void main(String[] args){
        RansomNote ransomNote = new RansomNote();
        System.out.println(ransomNote.note("cc","cc"));
    }
}

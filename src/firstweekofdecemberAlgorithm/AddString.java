package firstweekofdecemberAlgorithm;
//https://leetcode.com/problems/add-strings/
public class AddString {
    public String addStringValue(String num1,String num2){
        int i = Integer.parseInt(num1);
        int j = Integer.parseInt(num2);
        int addedValue = i+j;
        System.out.println(addedValue);
        return String.valueOf(addedValue);
    }
    public static void main(String[] args){
        AddString stringValue = new AddString();
        stringValue.addStringValue("123","233");
    }
}

package secondweekofjanuaryalgorithm;
//https://leetcode.com/problems/number-complement/
public class NumberComplements {
    public int findComplent(int num){
        String convertedNumberToBinary  = Integer.toBinaryString(num);
        String replace = convertedNumberToBinary.replaceAll("1","x").replaceAll("0","1").replaceAll("x","0");
        int convertBackedTOInt = Integer.parseInt(replace,2);

        System.out.println(convertBackedTOInt);
        return convertBackedTOInt;
    }
    public static void main(String[] args){
        NumberComplements complements = new NumberComplements();
        complements.findComplent(1);
    }
}

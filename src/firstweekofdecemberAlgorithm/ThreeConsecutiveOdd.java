package firstweekofjanuaryAlgorithm;
//https://leetcode.com/problems/three-consecutive-odds/description/?envType=problem-list-v2&envId=prshgx6i
public class ThreeConsecutiveOdd {
    public boolean consecutiveOdd(int[] arr){
        int odd = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] % 2 != 0) {
                odd++;
                if (odd == 3) {
                    return true;
                }
            } else {
                odd = 0;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ThreeConsecutiveOdd threeOdd = new ThreeConsecutiveOdd();
        int[] num ={1,2,34,3,4,5,7,23,12};
       boolean decision =  threeOdd.consecutiveOdd(num);
        System.out.println(decision);
    }
}

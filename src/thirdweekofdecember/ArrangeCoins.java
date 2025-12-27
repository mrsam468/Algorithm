package thirdweekofdecember;
//https://leetcode.com/problems/arranging-coins/
public class ArrangeCoins {
    public int coin(int n){
        int i = n/2;
        int k=n%2;
        if(k==0){
            int j = i%2;
            int v = n/i+1;

            return j+v;
        }else{
            return i;
        }
    }
    public static void main(String[] args){
        ArrangeCoins arrangeCoins = new ArrangeCoins();
        int decision = arrangeCoins.coin(10);
        System.out.println(decision);
    }
}

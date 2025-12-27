package thirdweekofdecember;
//https://leetcode.com/problems/nim-game/
public class NimGame {
    public boolean canWinNim(int n){
        if(n%4 > 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        NimGame nimGame = new NimGame();
        boolean decision = nimGame.canWinNim(2);
        System.out.println(decision);
    }

}

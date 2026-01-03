package resolvedalgorithms;
//https://leetcode.com/problems/unique-paths/description/
public class UniquePath {
    public int uniquePaths(int m,int n){
        if(m%2==0 || n%2==0){
            System.out.println(m);
            return m;
        }else{
            int mRemainder = m%2;
            int nRemainder =n%2;
            int addRemainderToN= mRemainder+nRemainder+n;
            int ans = addRemainderToN*m;
            System.out.println(ans);
            return m;
        }
    }
    public static void main(String[] args){
        UniquePath uniquePath = new UniquePath();
        uniquePath.uniquePaths(3,2);
    }
}

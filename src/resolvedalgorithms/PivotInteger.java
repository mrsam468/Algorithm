package resolvedalgorithms;

public class PivotInteger {
    public int pivot(int n){
        int count =0;
        int addition =0;
        int ans=0;

        for(int i=0;i<n;i++){
            count +=i;

            addition = count +1- 8;
            }
        if(n==1){
            ans=n;
        }else if(addition%2==1){
            ans = 1+addition/4;
        }else{
            ans =-1;
        }
        System.out.println(ans);

        return ans;
    }
    public static void main(String[] args){
        PivotInteger pivot = new PivotInteger();
        pivot.pivot(8);
    }
}

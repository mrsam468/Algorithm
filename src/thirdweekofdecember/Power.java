package thirdweekofdecember;
//https://leetcode.com/problems/powx-n/description/
public class Power {
    public double myPow(double x,int n){
        if (n == 0) return 1.0;
        if (x == 0) return 0.0;
        if (x == 1) return 1.0;
        if (x == -1 && n % 2 == 0) return 1.0;
        if (x == -1 && n % 2 != 0) return -1.0;

        long binform = n;
        if (n < 0) {
            x = 1 / x;
            binform = -binform;
        }

        double ans = 1.0;

        while (binform > 0) {
            if (binform % 2 == 1) {
                ans *= x;
            }
            x = x * x;
            binform /= 2;
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args){
        Power power = new Power();
        power.myPow(2.00000,10);
    }
}

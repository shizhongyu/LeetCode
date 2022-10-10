public class LeetCode50 {
    public static void main(String[] args) {
        System.out.println(myPow(2, 4));
    }

    public static double myPow(double x, int n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            n = -n;
            x = 1 / x;
        }
//
//        两种方式
        return fastPow(x, n);
//        return n % 2== 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }


    public static double fastPow(double x, int n){
        if(n == 0) {
            return 1;
        }
        double half = fastPow(x, n / 2);
        if(n % 2 == 0) {
            return half *half;
        }else {
            return half * half * x;
        }
    }
}

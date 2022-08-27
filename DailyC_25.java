public class DailyC_25 {
    final static int MOD = 94_906_249;
    public static long power(int base, int exponent) {
        if(exponent == 0) return 1;

    /*
        int half = exponent / 2;
        long temp = power(base, half);
        long result = (temp * temp) % 94906249;

        if(exponent % 2 == 1)
            return (base * result) % 94906249;
        else
            return result;
    */

        long half = power(base, exponent / 2);
        long result = half * half % MOD;

        if(exponent % 2 == 1)
            return result * base % MOD;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}

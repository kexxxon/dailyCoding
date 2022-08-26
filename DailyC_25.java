public class DailyC_25 {
    public static long power(int base, int exponent) {
        if(exponent == 0) return 1;

        int half = exponent / 2;
        long temp = power(base, half);
        long result = (temp * temp) % 94906249;

        if(exponent % 2 == 1)
            return (base * result) % 94906249;
        else
            return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}

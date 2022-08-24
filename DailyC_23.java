import java.io.IOException;

public class DailyC_23 {
    // Recursion
    public static int fibonacci(int num) {
        if(num == 0) return 0;
        else if(num < 2) return 1;
        else return fibonacci(num - 1) + fibonacci(num - 2);
    }

    // Memoization
    public static int fibonacciMemo(int num) {
        int[] memo = new int[num + 1];
        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2; i < num + 1; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[num];
    }

    public static void main(String[] args) throws IOException {
        System.out.println(fibonacci(6));
        System.out.println(fibonacciMemo(6));
    }
}
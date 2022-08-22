import java.util.Arrays;

public class DailyC_21 {
    public static int largestProductOfThree(int[] arr) {
        Arrays.sort(arr);

        int case1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        int case2 = arr[arr.length - 1] * arr[0] * arr[1];

        return Math.max(case1, case2);
    }

    public static void main(String[] args) {
        System.out.println(largestProductOfThree(new int[]{2, 1, 3, 7}));
        System.out.println(largestProductOfThree(new int[]{-1, 2, -5, 7}));
    }
}

public class DailyC_14 {
    public static boolean superIncreasing(int[] arr) {
        if(arr.length == 0) return false;
        int sum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] <= sum) return false;
            sum += arr[i];
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(superIncreasing(new int[]{1, 3, 6, 13, 54})); // true
        System.out.println(superIncreasing(new int[]{612, 1226})); // true
        System.out.println(superIncreasing(new int[]{1, 2, 4, 8, 15})); // true
    }
}

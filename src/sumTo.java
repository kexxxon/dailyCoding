public class sumTo {
    public static void main(String[] args) {

        Main.arrSum(new int[]{1, 2, 3});
        System.out.println(Main.arrSum(new int[]{1, 2, 3}));
    }
}

class Main {
    public static int arrSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}

import java.util.Arrays;

public class DailyC_22 {
    public static int[] bubbleSort(int[] arr) {

        int tmp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(bubbleSort(new int[]{5, 2, 7, 4, 8})));
    }
}
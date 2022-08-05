import java.util.Arrays;

public class DailyC_12 {
    public static int[] reverseArr(int[] arr) {
        if(arr.length == 0) return new int[]{};

        int[] head = Arrays.copyOfRange(arr, arr.length - 1, arr.length);

        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length - 1)); //[)

        int[] result = new int[head.length + tail.length];

        System.arraycopy(head, 0, result, 0, head.length);
        System.arraycopy(tail, 0, result, head.length, tail.length);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArr(new int[]{1, 2, 3})));
    }
}

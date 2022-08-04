import java.util.Arrays;

public class DailyC_11 {
    public static String[] removeExtremes(String[] arr) {
        if(arr.length == 0) return null;

        int max = 0;
        int min = 20;
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 0; i < arr.length; i++) {
            if(max <= arr[i].length()) {
                max = arr[i].length();
                maxIndex = i;
            }

            if(min >= arr[i].length()) {
                min = arr[i].length();
                minIndex = i;
            }
        }

        String[] result = new String[arr.length - 2];
        int idx = 0;

        for(int i = 0; i < arr.length; i++) {
            if(i == maxIndex) continue;
            if(i == minIndex) continue;

            result[idx] = arr[i];
            idx++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeExtremes(new String[]{"what", "a", "z", "lovely", "gloomy", "day!"})));
    }
}

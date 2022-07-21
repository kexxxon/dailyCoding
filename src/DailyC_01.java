import java.util.HashMap;

public class DailyC_01 {
    public static void main(String[] args) {
        TransformFirstAndLast.transformFirstAndLast(new String[]{"piano", "flute", "violin"});
        System.out.println(TransformFirstAndLast.transformFirstAndLast(new String[]{"piano", "flute", "violin"}));
    }
}

class TransformFirstAndLast {
    public static HashMap<String, String> transformFirstAndLast(String[] arr) {

        // return null when array is empty
        if(arr.length == 0) return null;

        // make a new HashMap to return result
        HashMap<String, String> result = new HashMap<>();

        // use method put() to return key and values
        result.put(arr[0], arr[arr.length - 1]);

        return result;
    }
}
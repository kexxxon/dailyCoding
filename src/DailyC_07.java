import java.util.HashMap;

public class DailyC_07 {
    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        HashMap<String, String> hashMap = new HashMap<>();

        // returns HashMap when an empty array is entered
        if(arr.length == 0) return hashMap;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length != 0) {
                if(!hashMap.containsKey(arr[i][0])) {
                    hashMap.put(arr[i][0], arr[i][1]);
                }
            }
        }

        return hashMap;
    }

    public static void main(String[] args) {
        System.out.println(convertListToHashMap(new String[][]{{"make", "Ford"}, {"model", "Mustang"}}));
    }
}

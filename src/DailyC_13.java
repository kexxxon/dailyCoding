public class DailyC_13 {
    public static String readVertically(String[] arr) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxLength < arr[i].length())
                maxLength = arr[i].length();
        }

        String[] tmp = new String[maxLength];
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];

            // 해당 배열 요소인 문자열 순회
            for (int j = 0; j < str.length(); j++) {
                if (tmp[j] == null)
                    tmp[j] = Character.toString(str.charAt(j));
                else
                    tmp[j] = tmp[j] + str.charAt(j);
            }
        }

        String result = "";
        for(int i = 0; i < tmp.length; i++) {
            result += tmp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(readVertically(new String[]{"hi", "world"}));
    }
}

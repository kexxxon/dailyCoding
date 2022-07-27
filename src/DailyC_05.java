public class DailyC_05 {
    public static void main(String[] args) {
        System.out.println(FirstReverse.firstReverse("!yad ylevol a tahW"));
    }
}

class FirstReverse {
    public static StringBuilder firstReverse(String str) {

        // 방법 1. StringBuilder
        // StringBuilder sb = new StringBuilder(str);
        // return sb.reverse().toString();

        // 방법 2. char[]
        char[] arr = str.toCharArray();
        char[] reversedArr = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[arr.length - 1 - i] = arr[i];
        }

        String reversedStr = new String(reversedArr);
        return new StringBuilder(reversedStr);
    }
}
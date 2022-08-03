public class DailyC_10 {

    public static String insertDash(String str) {
        String result = "";
        char[] charArr = str.toCharArray();

        for(int i = 0; i < charArr.length - 1; i++) {
            int int1 = charArr[i] - '0';    // 51 - 48 = 3
            int int2 = charArr[i+1] - '0';  // 53 - 48 = 5

            result += charArr[i];

            if((int1 % 2 == 1) && (int2 % 2 == 1)) {
                result += "-";
            }

        }
        return result + charArr[charArr.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(insertDash("454793"));
    }
}

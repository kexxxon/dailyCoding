/* Return String convert double spaces to single space */

public class DailyC_08 {
    public static String ConvertDoubleSpaceToSingle(String str) {
        String[] words = str.split("  ");
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(ConvertDoubleSpaceToSingle("what  a  lovely  day!"));
    }
}

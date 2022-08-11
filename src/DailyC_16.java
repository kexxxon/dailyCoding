public class DailyC_16 {
    public static boolean isIsogram(String str) {
        if(str.equals("")) return true;

        str = str.toLowerCase();
        String[] word = str.split("");

        for (String strArr : word) {
            if (str.indexOf(strArr) != str.lastIndexOf(strArr)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("candy"));
    }
}

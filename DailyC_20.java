public class DailyC_20 {

    public static String compressString(String str) {
        if(str.equals("")) return "";

        char before = str.charAt(0);

        int count = 1;
        String result = "";

        str += ' ';
        for (int i = 1; i < str.length(); i++) {
            // repeat same char
            if (before == str.charAt(i)) {
                // add count 1
                count++;
            } else {
                if(count >= 3) {
                    result = result + count + before;
                } else {
                    for(int j = 0; j < count; j++) {
                        result += before;
                    }
                }

                before = str.charAt(i);
                count = 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(compressString("wwwggoppopppp"));
    }
}

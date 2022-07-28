public class DailyC_06 {
    public static String letterCapitalize(String str) {

        String[] words = str.split(" ");
        String result = "";

        for(int i = 0; i < words.length; i++) {
            // String with the capitalised first letter of each word
            words[i] = String.valueOf(words[i].charAt(0)).toUpperCase()
                    + words[i].substring(1);
        }

        result = String.join(" ", words);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCapitalize("what a lovely day!"));
    }
}
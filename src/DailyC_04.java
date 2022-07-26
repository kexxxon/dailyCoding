public class DailyC_04 {
    public static void main(String[] args) {
        System.out.println(FirstCharacter.firstCharacter("lovely to meet you"));
    }
}

class FirstCharacter {
    public static String firstCharacter(String str) {
        if(str.length() == 0) return "";

        String[] words = str.split(" ");
        String  result = "";

        for(int i = 0; i < words.length; i++) {
            result += words[i].charAt(0);
        }

        return result;
    }
}
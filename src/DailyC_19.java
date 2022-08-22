public class DailyC_19 {
    public static String decryptCipher(String str, int secret) {

        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                result += str.charAt(i);
            } else {
                int asis = alphabet.indexOf(str.charAt(i));
                int tobe = (asis - secret + alphabet.length()) % alphabet.length();
                result += alphabet.charAt(tobe);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(decryptCipher("khoor", 3));
    }
}

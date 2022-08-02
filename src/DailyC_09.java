public class DailyC_09 {

    public static boolean ABCheck(String str) {
        String[] words = str.split("");

        for(int i = 0; i < words.length - 4; i++) {

            if((words[i].equals("a") || words[i].equals("A")) &&
               (words[i+4].equals("b") || words[i+4].equals("B"))) {
                return true;
            } else if((words[i].equals("b") || words[i].equals("B")) &&
                      (words[i+4].equals("a") || words[i+4].equals("A"))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ABCheck("HK9J6YjrAcMbq8qKrbS3EaPRT"));
    }
}
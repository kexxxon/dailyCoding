public class DailyC_18 {
    public static int numberSearch(String str) {

        // 1. declare findNum to find as String
        String findNum = "1234567890";

        // 2. return 0 if String is null
        if(str.equals("")) return 0;

        // 3. declare variable
        // 3-1. variable for count number
        double cnt = 0;
        // 3-2. variable to save String except numbers
        StringBuilder exclNum = new StringBuilder();

        // 4. rounds String
        for(int i = 0; i < str.length(); i++) {
            // 4-1. if the findNum value contains str[i], add 1
            if(findNum.indexOf(str.charAt(i)) != -1)
                cnt += Character.getNumericValue(str.charAt(i));

            // 4-2. if it doesn't exist, if it's not a blank,
            else if(str.charAt(i) != ' ')
                exclNum.append(str.charAt(i));
        }

        // 5. result
        // 5-1. add the corresponding String to exclNum
        double result = cnt / exclNum.length();

        // 5-2. return rounded values from decimal point using Math.round
        return (int)Math.round((result * 10) / 10);
    }

    public static void main(String[] args) {
        System.out.println(numberSearch("La Campanella142sdgh2358"));
    }
}

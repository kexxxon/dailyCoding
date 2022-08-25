public class DailyC_24 {
    public static boolean isSubsetOf(int[] base, int[] sample) {
        for (int intSample : sample) {
            boolean flag = true;

            for (int intBase : base) {
                if (intSample == intBase) {
                    flag = false;
                    break;
                }
            }

            if (flag) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSubsetOf(new int[]{1, 3, 5, 7}, new int []{1, 7})); // true
        System.out.println(isSubsetOf(new int[]{1, 3, 5, 7}, new int []{2, 4})); // false
    }
}

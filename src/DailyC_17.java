public class DailyC_17 {

    public static String computeSquareRoot(int num) {

        double[] diffs = new double[]{1, 0.1, 0.01, 0.001};
        double base = 1;

        for (double diff : diffs) {
            while (base * base < num) {
                base = base + diff;
            }

            if (base * base == num) return String.format("%.2f", base);
            else base -= diff;
        }

        return String.format("%.2f", base);
    }

    public static void main(String[] args) {
        System.out.println(computeSquareRoot(9));
    }
}

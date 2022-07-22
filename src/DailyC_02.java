public class DailyC_02 {
    public static void main(String[] args) {
        ComputeWhenDouble.computeWhenDouble(3.8);
        System.out.println(ComputeWhenDouble.computeWhenDouble(5.7));
    }
}

class ComputeWhenDouble {
    public static int computeWhenDouble(double interestRate) {

        // Annual interest rate
        double rate = 1 + interestRate / 100;

        double principal = 1;
        int year = 0;

        // repeat while loop when the principal is less than double
        while(principal < 2) {
            principal *= rate;
            year++;
        }

        // return year when the principle is more than double
        return year;
    }
}
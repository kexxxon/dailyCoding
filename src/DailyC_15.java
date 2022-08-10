public class DailyC_15 {
    public static Integer modulo(int num1, int num2) {
        if(num2 == 0) return null;

        while(num1 >= num2) {
            num1 -= num2;
        }

        return num1;
    }

    public static void main(String[] args) {
        System.out.println(modulo(25, 4));  // 1
        System.out.println(modulo(25, 0));  // null
    }
}

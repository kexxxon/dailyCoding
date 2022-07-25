public class DailyC_03 {
    public static void main(String[] args) {
        System.out.println(PowerOfTwo.powerOfTwo(7));
    }
}

class PowerOfTwo {
    public static boolean powerOfTwo(long num) {

        if(num == 2) return true;

        while(num > 2) {
            num /= 2;
            long rest = num % 2;

            if(rest == 1) return false;
        }

        return true;
    }
}

/* num이 2의 거듭제곱인지 여부 리턴

    flow
	- 2의 거듭제곱?
		2의 0승 == 1
		2 * 2 = 4
		2 * 2 * 2 = 8
		2 * 2 * 2 * 2 = 16
		2 * 2 * 2 * 2 * 2 = 32

	- 짝수라고 다 거듭제곱은 아님 => 6, 10 이런거
		6 = 2 * 3
		10 = 2 * 5

	=> 로직흐름: 2로 나눈 나머지가 다 0?
    - 초기값: 8
         | 몫 | 나머지
    1회차 | 4 |  0
    2회차 | 2 |  0

    - 초기값: 10
         | 몫 | 나머지
    1회차 | 5 |  0
    2회차 | 2 |  1

    - 초기값: 7
         | 몫 | 나머지
    1회차 | 3 |  1
    2회차 | 1 |  1

  => 나머지가 1이 하나라도 있으면 거듭제곱 X
  => 모두 0이면 거듭제곱!!!
*/
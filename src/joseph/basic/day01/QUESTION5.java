package joseph.basic.day01;

public class QUESTION5 {
	public static void main(String[] args) {

		double number = (1 / 3) * 3;
		System.out.println("(1 / 3) * 3 = " + number);

		// 예상값 : 1, 실제값 : 0.0
		// '정수 나누기 정수'의 결과값은 정수이기 때문에

		int quotient = 7 / 3;
		System.out.println("(7 / 3) = " + quotient);
		// 예상값 : 2.3333, 실제값 : 2
		// '정수 나누기 정수'의 결과값은 정수이기 때문에

		int remainder = 7 % 3;
		System.out.println("(7 % 3) = " + remainder);
		// 예상값 : 1, 실제값 : 0.0
		// '정수 나누기 정수'의 결과값은 정수이기 때문에

		int result;
		result = 11;
		result /= 2;
		System.out.println("result /= 2=" + result);

		// 복합대입 연산자
		// 산숭연산자와 대입연산자를 합쳐놓은 연산자
		// ex) a + 1 = a => a += 1

		double xx = 2.5;
		double yy = 2.5;
		int m = 18;
		int n = 4;

		double result2 = xx + n * yy - (xx + n) * yy;
		System.out.println("xx + n * yy - (x + n) * y = " + result2);

		double result3 = (m / n) + (m % n);
		System.out.println("(M / N) + (M % N) = " + result3);
	}
}

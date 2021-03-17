package joseph.basic.day01;

public class QUESTION3 {
	public static void main(String[] args) {
		// 표현식 : Expression
		// 계산이나 처리를 위해 작성하는 식을 의미
		// 수학에서 말하는 수식과 유사하다
		// 표현식의 중요한 특징은 평가 Evaluate이다
		// 즉, 코드의 결과를 알아내는 과정을 의미한다

		// 변수선언
		int x, y, z, s, s0, v, t, g;
		int result;

		// 처리
		x = 10;
		y = 20;
		z = 30;
		s0 = 40;
		v = 10;
		t = 10;
		g = 20;

		// 결과출력
		result = 3 * x; // 3x
		System.out.println(result);

		result = 3 * x + y;
		System.out.println("3X + Y = ");

		System.out.print("(x + y) / 7 = ");
		System.out.println((x + y) / 7);

		System.out.print("3x + y / z + 2 = ");
		System.out.println((3 * x) + y / z + 2);

		System.out.print("S = S + (V * T) + 0.5 * g * t^2 = ");
		System.out.println(s0 + (v * t) + 0.5 * (g * (t ^ 2)));

	}
}
package june.basic.day03;

public class Operators {
	public static void main(String[] args) {
		// 개발자용 폰트
		// 개발자의 취향에 따라 합자(laightaure)를
		// 지원하는 폰트 사용여부 결정
		// 이것을 사용함에 따라 수학기호를 다로 표시하시던지
		// 붙여서 표현하든지 결정할 수 있음
		// 가능한 폰트 : d2coding -> 네이버에서 개발한 글꼴 , cascadia -> 직접 해볼 수 있도록 할 것

		// 연산자 Operator
		// 여러 종류의 연산을 수행하기 위해 제공되는 기호
		// 산술연산, 비교연산, 논리, 조건연산(삼항연산자) -> The most common things to memorise

		// 산술연산 : 사칙연산을 다루는 연산자
		// +, -, *, /, %
		int x = 30, y = 15; // 변수선언과 값 초기화를 동시에 같이 수행

		System.out.println(" 30 + 15 = " + (x + y));
		System.out.println(" 30 - 15 = " + (x - y));
		System.out.println(" 30 * 15 = " + (x * y));
		System.out.println(" 30 / 15 = " + (x / y));
		System.out.println(" 30 % 15 = " + (x % y));

		// 비교연산 : 값들의 상대적인 크기를 판단
		// 왼족 피연산자와 오른쪽 피연산자를 비교
		// 비교연산의 결과는 논리값(Boolean Value)로 반환된다
		System.out.println(" 30 > 15 " + (x > y));
		System.out.println(" 30 >= 15 " + (x >= y));
		System.out.println(" 30 =< 15 " + (x <= y));
		System.out.println(" 30 < 15 " + (x < y));
		System.out.println(" 30 != 15" + (x != y));
		System.out.println(" 30 = 15" + (x = y));

		// 논리연산 : 주어진 논리식을 판단
		// 논리연산의 결과는 논리값 ( 참 , 거짓 )으로 반환
		// 보통 2개 이상의 비교연산으로 구성됨
		// 논리곱연산 : &, && (short - cericuit 지원)
		// 논리합연산 : |, ||
		// 논리부정연산 : !

		// 단축식 평가 : short-circuit
		// 여러개의 논리식중에 어떤 식에 의해 참거짓이 확정되면
		// 나머지 논리식을 평가하지 않음

		boolean result = (x > y) & (x != y);
		System.out.println("(x > y) and (x != y)" + result);

		// 조건연산자(삼항연산자)
		// 3개의 피연산자를 이용해서 조건에 따라
		// 특정 피연산자를 취하도록 사용하는 특수한 연산자
		// 형식 : 조건식 ? 참일대값 : 거짓일때값
		String result2 = x > y ? "X가 큽니다" : "Y가 큽니다";
		System.out.println(result2);

	}
}
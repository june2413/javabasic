package joseph.basic.day03;

public class EX02 {
	public static void main(String[] args) {

		// 7TH QUESTION
		System.out.println(3 + (4.5 * 2) + (27 / 8));
		System.out.println(true || false && 3 < 4 || !(5 == 7));
		System.out.println(true || (3 < 5 && 6 >= 2));

		// 잘못된 비교대상으로 오류
		// System.out.println(!true > 'A');

		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		// 단일문자를 수식에 사용하면
		// 자동으로 숫자형으로 바뀜
		// 숫자형으로 변환되는 기준은 ASCII 코드값
		// 0 : 48 , A : 65, A : 97 ,
		// Z : 90, D : 68 , M = 77
		// -> 아스키 코드 참고하기
		// 아스키 코드 사용 시에 무조건 '' 작은 따움표를 사용할 것 !!

		System.out.println(5.0 / 3 + 3 / 3);

		System.out.println('D' + 1 + 'M' % 2 / 3);

		System.out.println((5.0 / 3) + (3 / 3));

		System.out.println((53 % 21) < (45 / 18));

		// 8TH QUESTION
		System.out.println("May 13, 1988 fell on day number");

		// 특정연도 -1의 12월 31일의 요일 출력
		// 0 : 일 , 1 : 월 , 2:수 ,
		// 따라서, 특정연도의 1월 1일의 요일을 출력하려면
		// 계산식 결과에 +1을 해주면 됨

		System.out.println(
				((13 + (13 * 3 - 1) / 5 + 2021 % 100 + 2021 % 100 / 4 + 2021 / 400 - 2 * (2021 / 100)) % 7 + 7) % 7);

		System.out.println(" Check out this line  ");

		System.out.println("//hello there " + '9' + 7);

		System.out.println('H' + 'I' + " is " + 1 + "more example");
		// 'H', 'I' 사이 산술연산자로 인해
		// H 와 I가 숫자형으로 변환되어 연산이 수행됨

		System.out.println('H' + 6.5 + 'I' + " is " + 1 + "more example");

		System.out.println("Print both of us" + " me too");

		System.out.println("Reverse " + 'I' + 'T');

		System.out.println("No! Here is" + " one" + " more example");

		System.out.println("Here is" + (10 * 10)); // that’s 100);

		// System.out.println();
		// 출력할 대상이 지정되지 않았으므로 오류발생!
		// 괄호가 없어서 오류가 발생

		// System.out.println("How about this one" ++ '?' + 'Huh?");
		// 문자열에 사용할 수 없는 증감연산자를 사용했음

		// 증감연산자 (증가 + 감소 -> 합친말이다)
		// 피연산자의 값을 하나 증가시키거나 감소시킴
		// 피연산자의 어느쪽에 위치하는가에 따라 연산의 순서가 달라진다
		// i = 1 -> i = i + 1 -> i += 1(해당 방법으로 표기 ) ++i
		// -> i = i + 3 -> i += 3

		int a = 7, b = 7;
		int result3 = ++a + 10; // a값을 증가시킨후 연산 적용 (전치)
		int result4 = b++ + 10; // a값을 연산에 사용한 후 값 증가(후치)

		System.out.println(result3);
		System.out.println(result4);
	}
}
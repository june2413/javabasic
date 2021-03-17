package joseph.basic.day01;

/*
 * @author Joseph 
 * @category javabasic
 * @version 1.0
 * @자바기초프로그램 -성적처리 프로그램
 * 
 * 입력 : 이름,국어,영어,수학
 * 처리 : 총점, 평균,학점
 * 출력 : 이름,국어,영어,수학,총잠,평균,학점
 */

public class SungJukV1 {
	public static void main(String[] args) {
		// 변수선언
		String name;
		int korean;
		int english;
		int math;
		int tot;
		double avg;
		char grd;

		// 처리
		name = "홍길동";
		korean = 95;
		english = 78;
		math = 84;
		tot = korean + english + math;
		avg = tot / 3;
		grd = '가';
		// tot = 95 + 78 + 84;
		// avg = tot / 3;
		// 결과 출력

		System.out.print("이름 : ");
		System.out.println(name);
		System.out.print("국어 : ");
		System.out.println(korean);
		System.out.print("영어 : ");
		System.out.println(english);
		System.out.print("수학 : ");
		System.out.println(math);
		System.out.print("총점 : ");
		System.out.println(tot);
		System.out.print("평균 : ");
		System.out.println(avg);
		System.out.print("학점 : ");
		System.out.println(grd);

	}
}

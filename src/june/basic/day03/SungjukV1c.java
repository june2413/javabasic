package june.basic.day03;

import java.util.Scanner;

/*
 * @author Joseph 
 * @category javabasic
 * @version 1.2
 * @자바기초프로그램 -성적처리 프로그램
 * 
 * 이름과 성정데이터를 키보드로 직접 입력받아 처리
 * 총점, 평균, 학점 처리하고 결과 출력 
 *  
 */

public class SungjukV1c {
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
		Scanner sc = new Scanner(System.in);
		// 키포드를 이용해서 성적데이터를 입력받기 위해
		// Scanner 클래스를 초기화함

		System.out.print("이름은");
		name = sc.next();
		// 키보드를 문자데이터를 입력받아 name 변수에 대입
		System.out.print("국어는");
		korean = sc.nextInt();
		// 키보드로 숫자데이터를 입력받아 name 변수에 대입
		System.out.print("영어는");
		english = sc.nextInt();

		System.out.print("수학은");
		math = sc.nextInt();

		// 총점, 평균, 학점 계산 처리
		tot = (korean + english + math);
		avg = (double) tot / 3;
		grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

		System.out.println(tot);
		System.out.println(avg);
		System.out.println(grd);

		// 출력
		// 이름 : , 국어 , 영어, 수학
		String fmt = "이름: %s 국어 : %d ,영어 : %d ,수학 : %d\n";
		System.out.printf(fmt, name, korean, english, math);

		// 총점 : , 평균, 학점
		fmt = "총점 : %d , 평균 : %.1f, 성적 : %c";
		System.out.printf(fmt, tot, avg, grd);

	}
}
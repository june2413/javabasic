package june.basic.day11;

import java.util.Scanner;

public class EX06_1 {
    public static void main(String[] args) {
        // Q14 다음 조건을 만족하는 프로그램을 작성하여라 (TimeTime)
//
        int day;
        int hour;
        int min;
        Scanner sc = new Scanner(System.in);
        System.out.println("일수로 바꿀 초를 입력해주세요");
         day =sc.nextInt();
        System.out.println("시간으로 바꿀 초를 입력해주세요");
        hour = sc.nextInt();
        System.out.println("분으로 바꿀 초를 입력해주세요");
        min = sc.nextInt();


        //하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
        System.out.println(Math.floor( (double) day/86400) + "일" );


//        한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라

        System.out.println(Math.floor( (double) hour/3600) + "시간" );

//        일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라.
        System.out.println(Math.floor( (double) min/60) + "분" );


        // Q25 다음 조건을 만족하는 복권 발행 프로그램을 작성하세요. (Lotto)

        // 가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey)

        // 나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)
        // 다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급

        // 라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력




    }
}

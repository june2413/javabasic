package june.basic.day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {

        // Q12 생년월일 computeBirth

        int birth;
        Scanner sc = new Scanner(System.in);

        System.out.print("출생년도를 입력하세요");
        birth = sc.nextInt();

        String fmt = "출생년도는 %d, 이며 \n" +
                "나이는 %d입니다";
        System.out.printf(fmt, birth, 2022 - birth);







        // Q16 잔돈계산 computeChange

        int change ;

        System.out.print("잔돈을 입력하세요");
        change = sc.nextInt();
        System.out.println("잔돈: " + change + "원");

        int ocheon = 0;
        int cheon = 0;
        int obeak = 0;
        int beak = 0;

        ocheon =  change/ 5000;
        cheon = change % 5000 / 1000;
        obeak = change % 5000 % 1000 / 500;
        beak = change % 5000 % 1000 % 500 / 100;

        System.out.println("오천원 : "+ocheon);
        System.out.println("천원 : "+cheon);
        System.out.println("오백원 : "+obeak);
        System.out.println("백원 : "+beak);
    }





    }

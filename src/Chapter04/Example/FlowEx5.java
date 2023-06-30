package Chapter04.Example;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("点数を入力してください。＞");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("あなたの点数は%dです。%n", score);

        if (score >= 90) {              // scoreが90点より同じや高いならばA単位(grade)
            grade = 'A';
            if (score >= 98) {          // 90点以上の中でも98点以上はA+
                opt = '+';
            } else if (score >= 94) {   // 90点以上94点未満はA=
                opt = '-';
            }
        } else if (score >= 80) {       // scoreが80点より同じや高いならばB単位(grade)
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score >= 84) {
                opt = '-';
            }
        } else {                        // 残りはC点(grade)
            opt = 'C';
        }

        System.out.printf("あなたの単位は%c%cです。", grade, opt);
    }
}

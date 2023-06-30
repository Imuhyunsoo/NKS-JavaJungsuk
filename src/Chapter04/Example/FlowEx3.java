package Chapter04.Example;

import java.util.Arrays;
import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        System.out.print("数字を一つ入力してください。＞");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();   // 画面を通じて入力された数字をinputに保存

        if (input == 0) {
            System.out.println("入力した数字は0です。");
        } else {
            System.out.println("入力した数字は0じゃありません。");
        }
    }
}

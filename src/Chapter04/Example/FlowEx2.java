package Chapter04.Example;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.print("数字を入力してください。＞");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();   // 画面を通じて入力受けた内容をtmpに保存
        input = Integer.parseInt(tmp);     // 入力した文字列(tmp)を数字に変換

        if (input == 0) {
            System.out.println("入力した数字は 0です");
        }

        if (input != 0)
            System.out.println("入力した数字は0じゃありません。");
            System.out.printf("入力した数字は%dです。", input);

    }
}

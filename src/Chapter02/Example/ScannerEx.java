package Chapter02.Example;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("2桁の整数を入力してください。＞");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("入力内容：" + input);
        System.out.printf("num=%d%n", num);
    }
}

package Chapter03.Example;

public class OperatorEx12 {
    public static void main(String[] args) {
        char c1 = 'a';    // c1には文字「a」のコード値の97が保存する。
        char c2 = c1;     // c1に保存されているc2に保存する。
        char c3 = ' ';    // c3を空白に初期化。

        int i = c1 + 1;   // 'a'+1 → 97+1 → 98

        c3 = (char) (c1 + 1);
        c2++;
        c2++;

        System.out.println("i = " +i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}

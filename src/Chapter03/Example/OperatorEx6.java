package Chapter03.Example;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b); // コンパイルエラーが発生から (byte)で型変換が必要だ。
        System.out.println(c);
    }
}

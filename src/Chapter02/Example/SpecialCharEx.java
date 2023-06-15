package Chapter02.Example;

public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');               // '''みたいにできない。
        System.out.println("abc\t123\b456");    // \b のせいで 3が消える。
        System.out.println('\n');               //　改行（new line)文字を出力して改行。
        System.out.println("\"Hello\"");        // ダブルクォーテーションを出力するときはこうする。
        System.out.println("c:\\");
    }
}

package Chapter02.Example;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';        // char ch = 65;
        int code = (int)ch;   // ch に保存された値を int たいぷに変換して保存する。

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = 'あ';      // char hch = 0x3042
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}

package Chapter03.Example;

public class OperatorEx14 {
    public static void main(String[] args) {
        char c = 'a';
        for (int i = 0; i < 26; i++) {   // ブロック｛｝中の文章を26番繰り返し
            System.out.print(c++);       // 'a'から26個の文字を出力
        }
        System.out.println();
        c = 'A';
        for (int i = 0; i < 26; i++) {   // ブロック｛｝中の文章を26番繰り返し
            System.out.print(c++);       // 'A'から26個の文字を出力
        }
        System.out.println();
        c = '0';
        for (int i = 0; i < 10; i++) {   // ブロック｛｝中の文章を26番繰り返し
            System.out.print(c++);       // '0'から10個の文字を出力
        }
    }
}

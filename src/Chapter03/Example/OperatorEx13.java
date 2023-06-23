package Chapter03.Example;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
        // char c2 =  c1+ 1;   // ライン　５：コンパイルエラーが発生
        char c2 = 'a' + 1;     // ライン　６；コンパイルエラーなし

        System.out.println(c2);
    }
}

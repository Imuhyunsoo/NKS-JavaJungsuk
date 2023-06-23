package Chapter03.Example;

public class OperatorEx1 {
    public static void main(String[] args) {
        int i = 5;
        i++;        // i = i + 1; と同じ意味だ。++i; で変わっても構わない。
        System.out.println(i);
        i = 5;
        ++i;        // 結果を比較するためにiの値をもう一度5に変更。
        System.out.println(i);
    }
}

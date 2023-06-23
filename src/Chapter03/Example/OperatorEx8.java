package Chapter03.Example;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;  // 1,000,000 百万
        int b = 2_000_000;  // 2,000,000 二百万

        long c = a * b;     // a * b = 2,000,000,000,000 ?

        System.out.println(c);
    }
}

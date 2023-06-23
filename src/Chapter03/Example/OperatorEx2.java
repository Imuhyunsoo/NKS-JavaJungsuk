package Chapter03.Example;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.println("j = i++; 実行後、i = " + i + " j = " + j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j = ++i; 実行後、i = " + i + " j = " + j);
    }
}

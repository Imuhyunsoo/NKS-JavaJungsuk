package Chapter02.Example;

public class VarEx1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;  // 変数 ageの値に2000を加えて変数yearに保存
        age = age + 1;      // 変数 ageに保存された値を1増加
    }
}

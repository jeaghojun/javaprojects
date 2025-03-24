package chapter02;

public class Code02_07 {
    public static void main(String[] args) {
        int a= 100;
        int b= 300;

        int result = a + b;
        System.out.printf("%d + %d = %d\n", a, b, result);

        result = b - a;
        System.out.printf("%d - %d = %d\n", b, a, result);

        result = a * b;
        System.out.printf("%d * %d = %d\n", a, b, result);

        result = b/a;
        System.out.printf("%d / %d = %d\n", b, a, result);
    }
}

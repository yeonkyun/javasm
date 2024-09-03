package op;

public class Op2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = ++a + b++;
        System.out.printf("result: %d, a: %d, b: %d\n", result, a, b);
    }
}

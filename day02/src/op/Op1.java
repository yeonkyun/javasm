package op;

public class Op1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a++ > 0 || b++ < 0) {
            System.out.println("OK!");
        } else {
            System.out.println("FAIL!");
        }

        System.out.printf("a: %d, b: %d\n", a, b);
    }
}

package variable;

public class Var3 {
    public double calc(int a, int b) {
        return a * 1.0 / b;
    }

    public static void main(String[] args) {
        Var3 var3 = new Var3();

        int num1 = 10;
        int num2 = 3;

        System.out.println(var3.calc(num1, num2));
    }
}

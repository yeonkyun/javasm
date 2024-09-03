package variable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str = "JAVA";
        int num = 100;
        double num2 = 10 / 3.0; // 포맷터
        System.out.printf("%s 이고 %d 이고 %10.3f", str, num, num2);
        System.out.printf("OK");
        System.out.printf("%d \n", num);
        System.out.printf("%o \n", num);
        System.out.printf("%x \n", num);
        System.out.printf("OK");
    }
}

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int a = 300000000;
        byte b1 = (byte)200;
        System.out.println(b1);

        byte num1 = 100;
        byte num2 = 100;
        byte num3 = (byte) (num1 + num2);
        System.out.println(num3);

        long num4 = 3000000000L;
        long num5 = 1500000000L + 1500000000L;
        System.out.println(num5);

        int i1 = 1500000000;
        int i2 = 1500000000;
        long result = i1 * 1L + i2 * 1L;
        System.out.println(result);
    }
}
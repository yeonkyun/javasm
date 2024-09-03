package array;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int[] a = null;
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100) + 1;
        }
        System.out.println(a);

        for (int n:a) {
            System.out.println(n);
        }
    }
}

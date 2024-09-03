package workshop;

import java.util.Arrays;
import java.util.Random;

public class workshop1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[5];
        int min;
        int max;

        for (int i = 0; i < 5; i++) {
            int temp = random.nextInt(10) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[j] == temp) {
                    i--;
                    break;
                } else {
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("최소값: " + Arrays.stream(arr).min().getAsInt());
        System.out.println("최대값: " + Arrays.stream(arr).max().getAsInt());
    }
}

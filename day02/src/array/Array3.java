package array;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        int a[][] = new int[5][5];

        // 1 ~ 100까지의 랜덤한 숫자를 각 인덱스에 넣고 예쁘게 출력
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(100) + 1;
            }
        }

        for (int np[]:a) {
            for (int n:np) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
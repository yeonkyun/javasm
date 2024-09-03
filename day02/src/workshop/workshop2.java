package workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class workshop2 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("로또게임을 시작합니다.");
        System.out.println("1 ~ 40 사이의 숫자 5개를 입력하세요.");

        int[] lotto = new int[5];
        int[] userLotto = new int[5];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(40) + 1;

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < userLotto.length; i++) {
            System.out.print(i + "번호를 입력하세요: ");
            userLotto[i] = Integer.parseInt(br.readLine());

            for (int j = 0; j < i; j++) {
                if (userLotto[i] == userLotto[j]) {
                    i--;
                    break;
                } else if (userLotto[i] < 1 || userLotto[i] > 40) {
                    System.out.println("1 ~ 40 사이의 숫자를 입력하세요.");
                    i--;
                    break;
                }
            }
        }

        int hit = 0;

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < userLotto.length; j++) {
                if (lotto[i] == userLotto[j]) {
                    hit++;
                }
            }
        }

        System.out.println("입력된 번호: " + userLotto[0] + ", " + userLotto[1] + ", " + userLotto[2] + ", " + userLotto[3] + ", " + userLotto[4]);
        System.out.println("당첨 번호: " + lotto[0] + ", " + lotto[1] + ", " + lotto[2] + ", " + lotto[3] + ", " + lotto[4]);
        System.out.println("맞춘 갯수: " + hit);

        switch (hit) {
            case 5:
                System.out.println("1등 당첨! 상금 100만원");
                break;
            case 4:
                System.out.println("2등 당첨! 상금 50만원");
                break;
            case 3:
                System.out.println("3등 당첨! 상금 10만원");
                break;
            case 2:
                System.out.println("4등 당첨! 상금 5만원");
                break;
            case 1:
                System.out.println("5등 당첨! 상금 1만원");
                break;
            default:
                System.out.println("당첨되지 않았습니다.");
                break;
        }
    }
}

package lotto;

import java.util.Arrays;
import java.util.Scanner;

public class User {
    public static final int INITIAL_BALANCE = 10000;
    public static final int LOTTO_PRICE = 1000;

    private int[] userLotto;
    private long money;

    public User() {
        this.userLotto = new int[Lotto.NUMBERS_COUNT];
        this.money = INITIAL_BALANCE;
    }

    public int[] getUserLotto() {
        return userLotto;
    }

    public long getMoney() {
        return money;
    }

    public void enterLotto(Scanner scanner) {
        System.out.println("1부터 " + Lotto.NUMBER_RANGE + "까지의 서로 다른 숫자 " + Lotto.NUMBERS_COUNT + "개를 입력하세요:");
        for (int i = 0; i < Lotto.NUMBERS_COUNT; i++) {
            while (true) {
                int num = scanner.nextInt();
                if (num < 1 || num > Lotto.NUMBER_RANGE) {
                    System.out.println("1부터 " + Lotto.NUMBER_RANGE + " 사이의 숫자를 입력하세요.");
                } else if (contains(userLotto, num)) {
                    System.out.println("이미 선택한 숫자입니다.");
                } else {
                    userLotto[i] = num;
                    break;
                }
            }
        }
        Arrays.sort(userLotto);
        money -= LOTTO_PRICE;
    }

    private boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) return true;
        }
        return false;
    }

    public void addMoney(long amount) {
        this.money += amount;
    }
}
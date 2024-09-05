package lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static final int NUMBERS_COUNT = 6;
    public static final int NUMBER_RANGE = 45;

    private int[] lottoNumbers;
    private int bonusNumber;

    public Lotto() {
        this.lottoNumbers = new int[NUMBERS_COUNT];
    }

    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    public void createLotto() {
        Random random = new Random();
        for (int i = 0; i < NUMBERS_COUNT; i++) {
            int num;
            do {
                num = random.nextInt(NUMBER_RANGE) + 1;
            } while (contains(lottoNumbers, num));
            lottoNumbers[i] = num;
        }
        Arrays.sort(lottoNumbers);

        do {
            bonusNumber = random.nextInt(NUMBER_RANGE) + 1;
        } while (contains(lottoNumbers, bonusNumber));
    }

    private boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) return true;
        }
        return false;
    }
}

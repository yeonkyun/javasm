package lotto;

import java.util.Arrays;

public class LottoGame {
    private static final long[] PRIZES = {0, 5000, 50000, 1400000, 50000000, 1900000000};

    public int compareLotto(int[] lotto, int[] userLotto, int bonusNumber) {
        int matchCount = 0;
        boolean bonusMatch = false;

        for (int num : userLotto) {
            if (contains(lotto, num)) {
                matchCount++;
            } else if (num == bonusNumber) {
                bonusMatch = true;
            }
        }

        if (matchCount == 6) return 5;
        if (matchCount == 5 && bonusMatch) return 4;
        if (matchCount == 5) return 3;
        if (matchCount == 4) return 2;
        if (matchCount == 3) return 1;
        return 0;
    }

    private boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) return true;
        }
        return false;
    }

    public long paymentPrize(int rank) {
        return PRIZES[rank];
    }

    public void displayResults(int[] userLotto, int[] winningNumbers, int bonusNumber, int rank, long prize) {
        System.out.println("당신의 번호: " + Arrays.toString(userLotto));
        System.out.println("당첨 번호: " + Arrays.toString(winningNumbers) + " + 보너스 번호: " + bonusNumber);
        if (rank > 0) {
            System.out.println("축하합니다! " + rank + "등 당첨! 상금: " + prize + "원");
        } else {
            System.out.println("아쉽게도 당첨되지 않았습니다.");
        }
    }
}
package lotto;

import java.util.Scanner;

public class LottoProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        LottoGame game = new LottoGame();

        while (true) {
            System.out.println("\n현재 잔액: " + user.getMoney() + "원");
            System.out.println("1. 로또 구매");
            System.out.println("2. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                if (user.getMoney() < User.LOTTO_PRICE) {
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }
                user.enterLotto(scanner);
                Lotto lotto = new Lotto();
                lotto.createLotto();

                int rank = game.compareLotto(lotto.getLottoNumbers(), user.getUserLotto(), lotto.getBonusNumber());
                long prize = game.paymentPrize(rank);
                user.addMoney(prize);

                game.displayResults(user.getUserLotto(), lotto.getLottoNumbers(), lotto.getBonusNumber(), rank, prize);
            } else if (choice == 2) {
                System.out.println("게임을 종료합니다. 최종 잔액: " + user.getMoney() + "원");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
        scanner.close();
    }
}
package kartrider;

import java.util.Scanner;

public class Main {

    // 메인 함수
    public static void main(String[] args) {
        Main game = new Main();
        game.startRace();
    }

    // 레이스 시작
    public void startRace() {
        Scanner scanner = new Scanner(System.in);

        // 여러 명의 드라이버 준비
        Driver driver1 = new Driver(5, 8, 7, 6);
        Driver driver2 = new Driver(7, 6, 9, 5);
        Driver driver3 = new Driver(6, 7, 5, 8);
        Driver driver4 = new Driver(8, 9, 4, 7);

        // 드라이버 선택 출력
        System.out.println("===== 드라이버 선택 =====");
        System.out.println("1. 드라이버 1");
        driver1.showDriverStats();
        System.out.println("2. 드라이버 2");
        driver2.showDriverStats();
        System.out.println("3. 드라이버 3");
        driver3.showDriverStats();
        System.out.println("4. 드라이버 4");
        driver4.showDriverStats();
        System.out.print("원하는 드라이버를 선택하세요 (1~4): ");
        int driverChoice = scanner.nextInt();

        Driver selectedDriver = switch (driverChoice) {
            case 1 -> driver1;
            case 2 -> driver2;
            case 3 -> driver3;
            case 4 -> driver4;
            default -> {
                System.out.println("잘못된 입력입니다. 기본 드라이버로 설정합니다.");
                yield driver1;
            }
        };

        System.out.println("드라이버를 선택하셨습니다!\n");

        Engine engine1 = new Engine(150, 8, 250, 0.7);  // 안정적인 주행, 낮은 드리프트 성능
        Engine engine2 = new Engine(170, 10, 270, 0.8); // 균형 잡힌 성능
        Engine engine3 = new Engine(190, 12, 280, 0.6); // 속도와 가속력에 특화, 낮은 드리프트 성능
        Engine engine4 = new Engine(200, 15, 300, 0.9); // 매우 높은 속도와 드리프트 성능        // 각 엔진을 장착한 자동차를 생성
        Car car1 = new Car(engine1);
        Car car2 = new Car(engine2);
        Car car3 = new Car(engine3);
        Car car4 = new Car(engine4);

        // 드라이버가 소유할 자동차를 추가
        selectedDriver.addCar(car1, 0);
        selectedDriver.addCar(car2, 1);
        selectedDriver.addCar(car3, 2);
        selectedDriver.addCar(car4, 3);

        // 자동차 선택 출력
        System.out.println("===== 자동차 선택 =====");
        System.out.println("* 자동차 1 #");
        System.out.println("   - 최대 속도:     150km/h");
        System.out.println("   - 가속력:         8");
        System.out.println("   - 부스터 속도:   250km/h");
        System.out.println("   - 드리프트 감소: 0.7");
        System.out.println();

        System.out.println("* 자동차 2 #");
        System.out.println("   - 최대 속도:     170km/h");
        System.out.println("   - 가속력:        10");
        System.out.println("   - 부스터 속도:   270km/h");
        System.out.println("   - 드리프트 감소: 0.8");
        System.out.println();

        System.out.println("* 자동차 3 #");
        System.out.println("   - 최대 속도:     190km/h");
        System.out.println("   - 가속력:        12");
        System.out.println("   - 부스터 속도:   280km/h");
        System.out.println("   - 드리프트 감소: 0.6");
        System.out.println();

        System.out.println("* 자동차 4 #");
        System.out.println("   - 최대 속도:     200km/h");
        System.out.println("   - 가속력:        15");
        System.out.println("   - 부스터 속도:   300km/h");
        System.out.println("   - 드리프트 감소: 0.9");
        System.out.println();

        System.out.print("원하는 자동차를 선택하세요 (1~4): ");
        int carChoice = scanner.nextInt();

        Car selectedCar;
        if (carChoice >= 1 && carChoice <= 4) {
            selectedCar = selectedDriver.getCar(carChoice - 1); // 인덱스는 0부터 시작하므로 -1
            if (selectedCar == null) {
                System.out.println("자동차 선택에 오류가 발생했습니다.");
                return;
            }
        } else {
            System.out.println("잘못된 입력입니다. 기본 자동차로 설정합니다.");
            selectedCar = selectedDriver.getCar(0);  // 기본적으로 첫 번째 자동차를 선택
        }

        System.out.println("자동차를 선택하셨습니다!\n");
        System.out.println("레이스를 시작합니다!");

        int totalTurns = 0;
        double totalDistance = 15.0;  // 총 트랙 길이 10km

        // 레이스가 끝날 때까지 반복
        while (selectedCar.getDistance() < totalDistance) {
            double remainingDistance = totalDistance - selectedCar.getDistance();

            // 현재 상태 출력 (부스터 게이지와 주행 거리, 남은 거리)
            System.out.printf("\n현재 주행 거리: %.2f km, 남은 거리: %.2f km\n", selectedCar.getDistance(), remainingDistance);
            System.out.printf("현재 속도: %d km/h, 부스터 게이지: %d/5\n", selectedCar.getSpeed(), selectedCar.getBoosterGauge());
            System.out.println("행동을 선택하세요: 1) 엑셀 2) 브레이크 3) 드리프트 4) 부스터");

            int action = scanner.nextInt();

            // 행동에 따라 자동차의 상태 변화
            switch (action) {
                case 1:
                    selectedCar.accelerate();
                    System.out.println("엑셀을 밟습니다... 현재 속도: " + selectedCar.getSpeed() + " km/h");
                    break;
                case 2:
                    selectedCar.brake();
                    System.out.println("브레이크를 밟습니다... 현재 속도: " + selectedCar.getSpeed() + " km/h");
                    break;
                case 3:
                    selectedCar.drift();
                    System.out.println("드리프트 중... 현재 속도: " + selectedCar.getSpeed() + " km/h");
                    break;
                case 4:
                    if (selectedCar.getBoosterGauge() >= 5) {
                        selectedCar.useBooster();
                        System.out.println("부스터 사용... 현재 속도: " + selectedCar.getSpeed() + " km/h");
                    } else {
                        System.out.println("부스터 게이지가 부족합니다.");
                    }
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 엑셀을 밟습니다...");
                    selectedCar.accelerate();
                    break;
            }

            // 각 턴마다 부스터가 꺼지면 속도를 리셋
            if (selectedCar.isBoosting() && selectedCar.getBoosterGauge() == 0) {
                selectedCar.resetBooster();
                System.out.println("부스터가 종료되었습니다. 속도가 리셋됩니다.");
            }

            // 드라이버 능력 적용
            selectedDriver.applyDriverSkills(selectedCar);

            totalTurns++;
        }

        // 레이스 종료 후 결과 출력
        System.out.println("\n레이스가 끝났습니다!");
        System.out.printf("총 턴 수: %d\n", totalTurns);
        System.out.printf("최종 속도: %d km/h\n", selectedCar.getSpeed());
        System.out.printf("총 주행 거리: %.2f km\n", selectedCar.getDistance());

        scanner.close();
    }
}
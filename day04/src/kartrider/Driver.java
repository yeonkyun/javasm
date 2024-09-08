package kartrider;

public class Driver {
    private final Car[] cars = new Car[3];

    private int reactionTime;
    private int corneringSkill;
    private int boosterControl;
    private int focus;

    public Driver(int reactionTime, int corneringSkill, int boosterControl, int focus) {
        this.reactionTime = reactionTime;
        this.corneringSkill = corneringSkill;
        this.boosterControl = boosterControl;
        this.focus = focus;
    }

    // 드라이버 능력을 자동차에 적용
    public void applyDriverSkills(Car car) {
        // 1. 반응 속도: 가속도를 증가시킴
        int acceleration = car.getEngine().getAcceleration();
        car.setSpeed(car.getSpeed() + (acceleration + this.reactionTime));

        // 2. 코너링 스킬: 드리프트 시 속도 감소량을 줄임
        if (car.isDrifting()) {
            double driftReduction = car.getEngine().getDriftReduction();
            // 코너링 스킬에 따라 드리프트 감속률 감소
            driftReduction -= this.corneringSkill * 0.01;  // 예: 10의 스킬이면 10% 추가 감소
            car.setSpeed((int) (car.getSpeed() * driftReduction));
        }

        // 3. 부스터 제어: 부스터 속도를 추가로 증가
        if (car.isBoosting()) {
            car.setSpeed(car.getSpeed() + this.boosterControl);
        }

        // 4. 집중력: 일정 거리 이상 주행 시 성능 향상
        if (car.getDistance() > 5.0) {  // 예: 5km 이상 주행 시
            car.setSpeed(car.getSpeed() + (this.focus / 10)); // 집중력이 높을수록 추가 속도
        }
    }

    // 자동차 추가
    public void addCar(Car car, int index) {
        if (index >= 0 && index < cars.length) {
            cars[index] = car;
        } else {
            System.out.println("자동차를 추가할 수 없습니다: 유효하지 않은 인덱스입니다.");
        }
    }

    // 자동차 가져오기
    public Car getCar(int index) {
        if (index >= 0 && index < cars.length) {
            return cars[index];
        } else {
            System.out.println("유효하지 않은 자동차 인덱스입니다.");
            return null;
        }
    }

    private String starGraph(int value) {
        StringBuilder graph = new StringBuilder();
        for (int i = 0; i < value; i++) {
            graph.append("*");
        }
        return graph.toString();
    }

    public void showDriverStats() {
        System.out.println("===== 드라이버 능력치 =====");
        System.out.printf("%-12s %s (%d)%n", "반응 속도:", starGraph(reactionTime), reactionTime);
        System.out.printf("%-12s %s (%d)%n", "코너링 스킬:", starGraph(corneringSkill), corneringSkill);
        System.out.printf("%-12s %s (%d)%n", "부스터 제어:", starGraph(boosterControl), boosterControl);
        System.out.printf("%-12s %s (%d)%n", "집중력:", starGraph(focus), focus);
        System.out.println("=======================");
    }

    // 이미 존재하는 배열 위치의 자동차를 변경
    public void setCars(Car car, int index) {
        if (index >= 0 && index < cars.length) {
            cars[index] = car;
        }
    }

    public int getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(int reactionTime) {
        this.reactionTime = reactionTime;
    }

    public int getCorneringSkill() {
        return corneringSkill;
    }

    public void setCorneringSkill(int corneringSkill) {
        this.corneringSkill = corneringSkill;
    }

    public int getBoosterControl() {
        return boosterControl;
    }

    public void setBoosterControl(int boosterControl) {
        this.boosterControl = boosterControl;
    }

    public int getFocus() {
        return focus;
    }

    public void setFocus(int focus) {
        this.focus = focus;
    }

    @Override
    public String toString() {
        return "Driver{" + "focus=" + focus + ", boosterControl=" + boosterControl + ", corneringSkill=" + corneringSkill + ", reactionTime=" + reactionTime + '}';
    }
}
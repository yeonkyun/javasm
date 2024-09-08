package kartrider_abstract;

public class Driver {
    private final Car[] cars = new Car[4];

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

    // Getters and Setters
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

    // Functionality methods
    public void applyDriverSkills(Car car) {
        // 1. 반응 속도: 가속도를 증가시킴
        int acceleration = car.getEngine().getAcceleration();
        car.setSpeed(car.getSpeed() + (acceleration + this.reactionTime));

        // 2. 코너링 스킬: 드리프트 시 속도 감소량을 줄임
        if (car.isDrifting()) {
            double driftReduction = 0.7 - (this.corneringSkill * 0.01);
            car.setSpeed((int) (car.getSpeed() * driftReduction));
        }

        // 3. 부스터 제어: 부스터 속도를 추가로 증가
        if (car.isBoosting()) {
            car.setSpeed(car.getSpeed() + this.boosterControl);
        }

        // 4. 집중력: 일정 거리 이상 주행 시 성능 향상
        if (car.getDistance() > 5.0) {
            car.setSpeed(car.getSpeed() + (this.focus / 10));
        }

        // Apply engine-specific skills
        Engine engine = car.getEngine();
        if (engine instanceof X_Engine) {
            ((X_Engine) engine).customPartsForX();
        } else if (engine instanceof V1_Engine) {
            ((V1_Engine) engine).dualBoosterSpeedAdjustment();
        } else if (engine instanceof HT_Engine) {
            ((HT_Engine) engine).instantTransformation();
        }
    }

    // Methods for adding and getting cars
    public void addCar(Car car, int index) {
        if (index >= 0 && index < cars.length) {
            cars[index] = car;
        } else {
            System.out.println("자동차를 추가할 수 없습니다: 유효하지 않은 인덱스입니다.");
        }
    }

    public Car getCar(int index) {
        if (index >= 0 && index < cars.length) {
            return cars[index];
        } else {
            System.out.println("유효하지 않은 자동차 인덱스입니다.");
            return null;
        }
    }

    public void showDriverStats() {
        System.out.println("===== 드라이버 능력치 =====");
        System.out.printf("%-12s %s (%d)%n", "반응 속도:", starGraph(reactionTime), reactionTime);
        System.out.printf("%-12s %s (%d)%n", "코너링 스킬:", starGraph(corneringSkill), corneringSkill);
        System.out.printf("%-12s %s (%d)%n", "부스터 제어:", starGraph(boosterControl), boosterControl);
        System.out.printf("%-12s %s (%d)%n", "집중력:", starGraph(focus), focus);
        System.out.println("=======================");
    }

    private String starGraph(int value) {
        StringBuilder graph = new StringBuilder();
        for (int i = 0; i < value; i++) {
            graph.append("*");
        }
        return graph.toString();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "reactionTime=" + reactionTime +
                ", corneringSkill=" + corneringSkill +
                ", boosterControl=" + boosterControl +
                ", focus=" + focus +
                '}';
    }
}
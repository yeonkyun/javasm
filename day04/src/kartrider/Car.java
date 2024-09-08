package kartrider;

public class Car {
    private Engine engine;
    private int speed;
    private int boosterGauge;
    private double distance;
    private boolean isBoosting;
    private boolean isDrifting;

    public Car(Engine engine) {
        this.engine = engine;
        this.speed = 0;
        this.boosterGauge = 0;
        this.distance = 0.0;
        this.isBoosting = false;
        this.isDrifting = false;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        // 부스터 사용 중이면 엔진의 최대 속도를 초과할 수 있음
        if (isBoosting) {
            this.speed = speed; // 부스터 사용 시 설정한 속도로 적용
        } else {
            // 부스터가 아닐 경우, 엔진 최대 속도보다 클 수 없도록 조정
            if (speed > engine.getMaxSpeed()) {
                this.speed = engine.getMaxSpeed();
            } else {
                this.speed = speed;
            }
        }
    }

    public int getBoosterGauge() {
        return boosterGauge;
    }

    public void setBoosterGauge(int boosterGauge) {
        this.boosterGauge = boosterGauge;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isBoosting() {
        return isBoosting;
    }

    public void setBoosting(boolean boosting) {
        isBoosting = boosting;
    }

    public boolean isDrifting() {
        return isDrifting;
    }

    public void setDrifting(boolean drifting) {
        isDrifting = drifting;
    }

    public void accelerate() {
        setSpeed(getSpeed() + engine.getAcceleration());
        updateDistance();
    }

    public void brake() {
        setSpeed(0);
    }

    public void drift() {
        isDrifting = true;
        // 엔진의 드리프트 감속률에 따라 속도 감소
        double driftReduction = engine.getDriftReduction();
        setSpeed((int) (getSpeed() * driftReduction));

        // 부스터 게이지 증가
        if (boosterGauge < 5) {
            boosterGauge++;
        }
        isDrifting = false;
    }


    public void useBooster() {
        if (boosterGauge >=5) {
            isBoosting = true;
            setSpeed(engine.getBoosterSpeed());
            boosterGauge -= 5;
        }
    }

    public void resetBooster() {
        isBoosting = false;
        setSpeed(engine.getMaxSpeed());
    }

    public void updateDistance() {
        this.distance += this.speed/60.0;
    }

    @Override
    public String toString() {
        return "Car{" + "engine=" + engine + ", speed=" + speed + ", boosterGauge=" + boosterGauge + ", distance=" + distance + ", isBoosting=" + isBoosting + ", isDrifting=" + isDrifting + '}';
    }
}
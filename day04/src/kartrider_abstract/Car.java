package kartrider_abstract;

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

    // Getters and Setters
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
        if (isBoosting) {
            this.speed = speed;
        } else {
            this.speed = Math.min(speed, engine.getMaxSpeed());
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

    // Functionality methods
    public void accelerate() {
        setSpeed(getSpeed() + engine.getAcceleration());
        updateDistance();
    }

    public void brake() {
        setSpeed(0);
    }

    public void drift() {
        isDrifting = true;
        double driftReduction = 0.7; // Default drift reduction
        if (engine instanceof PRO_Engine) {
            ((PRO_Engine) engine).boostBlurEffect();
            driftReduction = 0.8; // PRO_Engine has better drift
        }
        setSpeed((int) (getSpeed() * driftReduction));
        if (boosterGauge < 5) {
            boosterGauge++;
        }
        isDrifting = false;
    }

    public void useBooster() {
        if (boosterGauge >= 5 || (engine instanceof HT_Engine && ((HT_Engine) engine).isInfiniteBoostEnabled())) {
            isBoosting = true;
            setSpeed(engine.getBoosterSpeed());
            engine.activateBooster();
            if (!(engine instanceof HT_Engine && ((HT_Engine) engine).isInfiniteBoostEnabled())) {
                boosterGauge -= 5;
            }
            if (engine instanceof HT_Engine) {
                ((HT_Engine) engine).infiniteBoostActivation();
            }
        }
    }

    public void resetBooster() {
        isBoosting = false;
        setSpeed(engine.getMaxSpeed());
    }

    public void updateDistance() {
        this.distance += this.speed / 60.0;
    }

    public void handleCollision() {
        if (engine instanceof HT_Engine) {
            ((HT_Engine) engine).boostGaugeRecoveryOnCollision();
            if (((HT_Engine) engine).isBoostGaugeRecoveryEnabled()) {
                boosterGauge = Math.min(boosterGauge + 2, 5);
            }
        }
        if (engine instanceof V1_Engine) {
            ((V1_Engine) engine).crashGaugeSystem();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", speed=" + speed +
                ", boosterGauge=" + boosterGauge +
                ", distance=" + distance +
                ", isBoosting=" + isBoosting +
                ", isDrifting=" + isDrifting +
                '}';
    }
}
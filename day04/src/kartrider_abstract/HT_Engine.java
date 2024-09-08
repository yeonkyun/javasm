package kartrider_abstract;

public class HT_Engine extends Engine {
    private boolean infiniteBoostEnabled;
    private boolean boostGaugeRecoveryEnabled;

    public HT_Engine() {
        super();
    }

    public HT_Engine(int maxSpeed, int acc, int boosterSpeed, double efficiency, int durability,
                     boolean infiniteBoostEnabled, boolean boostGaugeRecoveryEnabled) {
        super(maxSpeed, acc, boosterSpeed, efficiency, durability);
        this.infiniteBoostEnabled = infiniteBoostEnabled;
        this.boostGaugeRecoveryEnabled = boostGaugeRecoveryEnabled;
    }

    @Override
    public void activateBooster() {
        System.out.println("HT Engine Booster Activated!");
        if (infiniteBoostEnabled) {
            infiniteBoostActivation();
        }
    }

    public void infiniteBoostActivation() {
        System.out.println("Infinite Boost Activated!");
    }

    public void boostGaugeRecoveryOnCollision() {
        if (boostGaugeRecoveryEnabled) {
            System.out.println("Boost Gauge Recovered on Collision!");
        }
    }

    public void instantTransformation() {
        System.out.println("Instant Transformation Activated!");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Infinite Boost=%b, Boost Gauge Recovery=%b",
                infiniteBoostEnabled, boostGaugeRecoveryEnabled);
    }
}
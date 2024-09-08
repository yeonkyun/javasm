package kartrider_abstract;

public class V1_Engine extends Engine {
    private boolean exceedBoosterEnabled;
    private boolean crashGaugeSystemEnabled;

    public V1_Engine() {
        super();
    }

    public V1_Engine(int maxSpeed, int acc, int boosterSpeed, double efficiency, int durability,
                     boolean exceedBoosterEnabled, boolean crashGaugeSystemEnabled) {
        super(maxSpeed, acc, boosterSpeed, efficiency, durability);
        this.exceedBoosterEnabled = exceedBoosterEnabled;
        this.crashGaugeSystemEnabled = crashGaugeSystemEnabled;
    }

    @Override
    public void activateBooster() {
        System.out.println("V1 Engine Booster Activated!");
        if (exceedBoosterEnabled) {
            exceedBoosterActivation();
        }
    }

    public void exceedBoosterActivation() {
        System.out.println("Exceed Booster Activated!");
    }

    public void crashGaugeSystem() {
        if (crashGaugeSystemEnabled) {
            System.out.println("Crash Gauge System Activated!");
        }
    }

    public void dualBoosterSpeedAdjustment() {
        System.out.println("Dual Booster Speed Adjusted!");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Exceed Booster=%b, Crash Gauge System=%b",
                exceedBoosterEnabled, crashGaugeSystemEnabled);
    }
}
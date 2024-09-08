package kartrider_abstract;

public class X_Engine extends Engine {
    private boolean dualBoosterEnabled;
    private boolean transformationEnabled;

    public X_Engine() {
        super();
    }

    public X_Engine(int maxSpeed, int acc, int boosterSpeed, double efficiency, int durability,
                    boolean dualBoosterEnabled, boolean transformationEnabled) {
        super(maxSpeed, acc, boosterSpeed, efficiency, durability);
        this.dualBoosterEnabled = dualBoosterEnabled;
        this.transformationEnabled = transformationEnabled;
    }

    @Override
    public void activateBooster() {
        System.out.println("X Engine Booster Activated!");
        if (dualBoosterEnabled) {
            dualBoosterSystem();
        }
    }

    public void dualBoosterSystem() {
        System.out.println("Dual Booster System Activated!");
    }

    public void transformationOptions() {
        if (transformationEnabled) {
            System.out.println("Transformation Options Available!");
        }
    }

    public void customPartsForX() {
        System.out.println("Custom Parts for X Engine Applied!");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Dual Booster=%b, Transformation=%b",
                dualBoosterEnabled, transformationEnabled);
    }
}
package kartrider_abstract;

public abstract class Engine {
    protected int maxSpeed;
    protected int acceleration;
    protected int boosterSpeed;
    protected double efficiency;
    protected int durability;

    public Engine() {
        // Default constructor
    }

    public Engine(int maxSpeed, int acc, int boosterSpeed, double efficiency, int durability) {
        this.maxSpeed = maxSpeed;
        this.acceleration = acc;
        this.boosterSpeed = boosterSpeed;
        this.efficiency = efficiency;
        this.durability = durability;
    }

    public abstract void activateBooster();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getBoosterSpeed() {
        return boosterSpeed;
    }

    public void setEfficiency(double eff) {
        this.efficiency = eff;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return String.format("Engine: Max Speed=%d, Acceleration=%d, Booster Speed=%d, Efficiency=%.2f, Durability=%d",
                maxSpeed, acceleration, boosterSpeed, efficiency, durability);
    }
}
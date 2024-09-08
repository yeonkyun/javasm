package kartrider_abstract;

public class PRO_Engine extends Engine {
    private boolean boostBlurEffectEnabled;
    private boolean soundEffectEnabled;

    public PRO_Engine() {
        super();
    }

    public PRO_Engine(int maxSpeed, int acc, int boosterSpeed, double efficiency, int durability,
                      boolean boostBlurEffectEnabled, boolean soundEffectEnabled) {
        super(maxSpeed, acc, boosterSpeed, efficiency, durability);
        this.boostBlurEffectEnabled = boostBlurEffectEnabled;
        this.soundEffectEnabled = soundEffectEnabled;
    }

    @Override
    public void activateBooster() {
        System.out.println("PRO Engine Booster Activated!");
        if (boostBlurEffectEnabled) {
            boostBlurEffect();
        }
        if (soundEffectEnabled) {
            soundEffects();
        }
    }

    public void soundEffects() {
        System.out.println("PRO Engine Sound Effects Played!");
    }

    public void boostBlurEffect() {
        System.out.println("Boost Blur Effect Applied!");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Boost Blur Effect=%b, Sound Effect=%b",
                boostBlurEffectEnabled, soundEffectEnabled);
    }
}
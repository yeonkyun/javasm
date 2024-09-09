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
        System.out.println("HT 엔진 부스터 작동!");
        if (infiniteBoostEnabled) {
            infiniteBoostActivation();
        }
    }

    public void infiniteBoostActivation() {
        System.out.println("무한 부스트 활성화!");
    }

    public void boostGaugeRecoveryOnCollision() {
        if (boostGaugeRecoveryEnabled) {
            System.out.println("충돌 시 부스트 게이지 복구!");
        }
    }

    public void instantTransformation() {
        System.out.println("즉시 변환 활성화!");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", 무한 부스트=%b, 부스트 게이지 복구=%b",
                infiniteBoostEnabled, boostGaugeRecoveryEnabled);
    }
}
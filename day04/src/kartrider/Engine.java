package kartrider;

public class Engine {
//
//    maxSpeed: 엔진의 최대 속도를 정의합니다.
//    acceleration: 엑셀을 밟았을 때 속도가 얼마나 증가할지를 결정합니다.
//    boosterSpeed: 부스터 사용 시 설정되는 속도를 나타냅니다.
//    efficiency: 연비 효율성을 나타내며, 게임에서 부스터 게이지 회복 속도 등에
//                영향을 줄 수 있습니다.
//    durability: 내구성으로, 드리프트 후 속도 손실이 적거나 부스터가 종료된 후
//                속도 유지에 영향을 미칠 수 있습니다.
//    driftReduction: 드리프트 시 감속률로, 드리프트 후 속도가 얼마나 감소할지를 나타냅니다.
//                예를 들어, driftReduction이 0.7이면 속도가 30% 감소합니다.

    private int maxSpeed;
    private int acceleration;
    private int boosterSpeed;
    //    private double efficiency;
//    private int durability;
    private double driftReduction;

    public Engine(int maxSpeed, int acceleration, int boosterSpeed, double driftReduction) {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.boosterSpeed = boosterSpeed;
//        this.efficiency = efficiency;
//        this.durability = durability;
        this.driftReduction = driftReduction;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getBoosterSpeed() {
        return boosterSpeed;
    }

    public void setBoosterSpeed(int boosterSpeed) {
        this.boosterSpeed = boosterSpeed;
    }

//    public double getEfficiency() {
//        return efficiency;
//    }
//
//    public void setEfficiency(double efficiency) {
//        this.efficiency = efficiency;
//    }
//
//    public int getDurability() {
//        return durability;
//    }
//
//    public void setDurability(int durability) {
//        this.durability = durability;
//    }

    public double getDriftReduction() {
        return driftReduction;
    }

    public void setDriftReduction(double driftReduction) {
        this.driftReduction = driftReduction;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "maxSpeed=" + maxSpeed +
                ", acceleration=" + acceleration +
                ", boosterSpeed=" + boosterSpeed +
                ", driftReduction=" + driftReduction +
                '}';
    }
}
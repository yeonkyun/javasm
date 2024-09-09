package maplestory.Archer;

public class Bowmaster extends Archer {
    @Override
    public void attack() {
        System.out.println("보우마스터 공격!");
    }

    @Override
    public void commonSkill() {
        super.commonSkill();
    }

    public void uncountableArrow() {
        System.out.println("보우 마스터 전용 스킬 : 언카운터블 애로우");
    }
}

package maplestory.Archer;

public class Marksman extends Archer {
    @Override
    public void attack() {
        System.out.println("신궁 공격!");
    }

    @Override
    public void commonSkill() {
        super.commonSkill();
    }

    public void piearcing(){
        System.out.println("신궁의 전용 스킬 : 피어싱");
    }
}

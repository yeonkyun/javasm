package maplestory.Warrior;

public class Paladin extends Warrior {
    @Override
    public void attack() {
        System.out.println("팔라딘 공격!");
    }

    @Override
    public void commonSkill() {
        super.commonSkill();
    }

    public void sanctuary(){
        System.out.println("팔라딘 전용 스킬 : 생츄어리");
    }
}

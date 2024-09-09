package maplestory.Warrior;

public class Hero extends Warrior {
    @Override
    public void attack() {
        System.out.println("히어로 공격!");
    }

    @Override
    public void commonSkill() {
        super.commonSkill();
    }

    public void rageBlow(){
        System.out.println("히어로 전용 스킬 : 레이지 블로우");
    }
}

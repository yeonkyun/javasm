package maplestory.Warrior;

public class DarkKnight extends Warrior {
    @Override
    public void attack() {
        System.out.println("다크나이트 공격!");
    }

    @Override
    public void commonSkill() {
        super.commonSkill();
    }

    public void darkImpale(){
        System.out.println("다크 나이트 전용 스킬 : 다크 임페일");
    }
}

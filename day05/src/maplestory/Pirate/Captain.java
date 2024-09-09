package maplestory.Pirate;

public class Captain extends Pirate {
    @Override
    public void attack() {
        System.out.println("캡틴 공격!");
    }

    public void BulletParty(){
        System.out.println("캡틴의 공용 스킬 : 불릿 파티");
    }
}

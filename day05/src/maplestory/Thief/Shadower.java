package maplestory.Thief;

public class Shadower extends Thief{
    @Override
    public void attack() {
        System.out.println("섀도어가 단검으로 공격!");
    }

    public void Assassination(){
        System.out.println("섀도어 전용 스킬 : 암살");
    }
}

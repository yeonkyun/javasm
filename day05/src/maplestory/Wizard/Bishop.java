package maplestory.Wizard;

public class Bishop extends Wizard {
    @Override
    public void attack() {
        System.out.println("비숍 공격!");
    }

    public void HolySymbol() {
        System.out.println("비숍 전용 스킬 : 홀리 심볼");
    }

    public void Genesis() {
        System.out.println("비숍 전용 스킬 : 제네시스");
    }
}
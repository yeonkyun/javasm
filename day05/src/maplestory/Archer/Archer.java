package maplestory.Archer;

import maplestory.Adventurer;

abstract public class Archer extends Adventurer {
    @Override
    public void commonSkill() {
        System.out.println("크리티컬 리인포스!");
    }
    public void sharpeEyes(){
        System.out.println("궁수의 공용 스킬 : 샤프 아이즈");
    }
}

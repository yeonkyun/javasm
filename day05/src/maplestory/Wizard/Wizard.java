package maplestory.Wizard;

import maplestory.Adventurer;

abstract public class Wizard extends Adventurer {
    @Override
    public void commonSkill() {
        System.out.println("에테리얼 폼!");
    }

    public void teleport(){
        System.out.println("마법사 공용 스킬 : 텔레포트");
    }

    public void magicGuard(){
        System.out.println("마법사 공용 스킬 : 매직 가드");
    }
}

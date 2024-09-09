package maplestory.Thief;

import maplestory.Adventurer;

abstract public class Thief extends Adventurer {
    @Override
    public void commonSkill() {
        System.out.println("레디 투 다이!");
    }

    public void luckySeven(){
        System.out.println("도적 공용 스킬 : 럭키 세븐");
    }
}

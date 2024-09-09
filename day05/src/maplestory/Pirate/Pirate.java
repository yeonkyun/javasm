package maplestory.Pirate;

import maplestory.Adventurer;

public abstract class Pirate extends Adventurer {
    @Override
    public void commonSkill() {
        System.out.println("오버 드라이브!");
    }

    public void SomersaultKick(){
        System.out.println("해적의 공용 스킬 : 썸머솔트 킥");
    }

    public void LuckyDice(){
        System.out.println("해적의 공용 스킬 : 럭키 다이스");
    }
}

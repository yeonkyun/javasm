package maplestory.Warrior;

import maplestory.Adventurer;

abstract public class Warrior extends Adventurer {
    @Override
    public void commonSkill() {
        System.out.println("오라 웨폰!");
    }
    public void hyperBody() {
        System.out.println("전사의 공용 스킬 : 하이퍼 바디");
    }

}
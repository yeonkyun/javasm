package maplestory;

abstract public class Adventurer {
    private int hp;
    private int mp;

    public Adventurer() {
    }

    public Adventurer(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

//    public void setHp(int hp) {
//        this.hp = hp;
//    }

    public int getMp() {
        return mp;
    }

//    public void setMp(int mp) {
//        this.mp = mp;
//    }

    abstract public void attack();
    abstract public void commonSkill();

    public void jump(){
        System.out.println("점프");
    }
}
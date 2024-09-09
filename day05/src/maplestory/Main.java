package maplestory;

import maplestory.Archer.*;
import maplestory.Thief.DualBlade;
import maplestory.Thief.NightLord;
import maplestory.Thief.Shadower;
import maplestory.Thief.Thief;
import maplestory.Warrior.*;
import maplestory.Wizard.ArchMage_SC;

public class Main {
    public static void main(String[] args) {
//        Adventurer[] warriors = new Warrior[3];
//
//        warriors[0] = new Hero();
//        warriors[1] = new Paladin();
//        warriors[2] = new DarkKnight();
//
//        for (int i = 0; i < warriors.length; i++) {
//            System.out.println(warriors[i].getClass().getSimpleName());
//            warriors[i].attack();
//            warriors[i].commonSkill();
//            System.out.println();
//        }
// 
//        Adventurer[] archers = new Archer[3];
//
//        archers[0] = new Pathfinder();
//        archers[1] = new Bowmaster();
//        archers[2] = new Marksman();
//
//        for (int i = 0; i < archers.length; i++) {
//            System.out.println(archers[i].getClass().getSimpleName());
//            archers[i].attack();
//            archers[i].commonSkill();
//            System.out.println();
//        }
//
//        Adventurer[] thiefs = new Thief[3];
//
//        thiefs[0] = new DualBlade();
//        thiefs[1] = new NightLord();
//        thiefs[2] = new Shadower();
//
        Adventurer Wizards = new ArchMage_SC();
        Wizards.commonSkill();
    }
}

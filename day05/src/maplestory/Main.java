package maplestory;

import maplestory.Archer.*;
import maplestory.Pirate.*;
import maplestory.Thief.*;
import maplestory.Warrior.*;
import maplestory.Wizard.*;

public class Main {
    public static void main(String[] args) {
        Adventurer[] player1 = new Adventurer[5];

        player1[0] = new Hero();
        player1[1] = new Bowmaster();
        player1[2] = new ArchMage_SC();
        player1[3] = new DualBlade();
        player1[4] = new Viper();

        for (Adventurer adventurer : player1) {
            if (adventurer instanceof Archer) {
                ((Archer) adventurer).SharpeEyes();
            } else if (adventurer instanceof Pirate) {
                ((Pirate) adventurer).LuckyDice();
            } else if (adventurer instanceof Thief) {
                ((Thief) adventurer).luckySeven();
            } else if (adventurer instanceof Warrior) {
                ((Warrior) adventurer).HyperBody();
            } else if (adventurer instanceof Wizard) {
                ((Wizard) adventurer).MagicGuard();
            }

            adventurer.attack();
        }

    }
}

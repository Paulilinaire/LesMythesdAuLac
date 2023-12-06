package org.example;


<<<<<<< HEAD
import org.example.classes.BuildingFactory;
import org.example.classes.entity.Building;
import org.example.classes.entity.Castle;
import org.example.classes.entity.impl.personalisation.MediumSize;
import org.example.classes.factory.impl.BarrackFactory;
import org.example.classes.factory.impl.CastleFactory;
import org.example.classes.factory.impl.ForgeFactory;
=======
import org.example.classes.entity.BonusCapacity;
import org.example.classes.entity.Capacity;
import org.example.classes.entity.Kingdom;
import org.example.classes.entity.Weapon;
import org.example.classes.entity.impl.Archer;
import org.example.classes.entity.impl.ArcherCapacity;
import org.example.classes.entity.impl.ArcherWeapon;
import org.example.classes.entity.impl.Sorcerer;
import org.example.classes.factory.impl.ArcherFactory;
>>>>>>> 982d7b97635f32233d716e5761e568e4c9c57174

public class Main {
    private static final Kingdom myKingdom = Kingdom.getInstance();
    public static void main(String[] args) {
        Castle castle = new Castle.Builder()
                .size("Large")
                .style("Classic")
                .functional("defense")
                .build();
        System.out.println(castle);

        // Creating an ArcherWeapon
        Weapon archerWeapon = new ArcherWeapon.Builder()
                .weaponName("Long Bow")
                .acquired(true)
                .damageLevel("High")
                .build();
        System.out.println(archerWeapon);

        // Creating a Sorcerer
        Sorcerer sorcerer1 = new Sorcerer.Builder()
                .name("Gandalf")
                .level(5)
                .health(5)
                .build();
        System.out.println(sorcerer1);
        myKingdom.getCharacterList().add(sorcerer1);

        // Creating an Archer
        Archer archer1 = new Archer.Builder()
                .name("Lin")
                .health(5)
                .build();
        myKingdom.getCharacterList().add(archer1);

        System.out.println(myKingdom.getCharacterList());



    }

}
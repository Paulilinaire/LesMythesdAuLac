package org.example;


import org.example.classes.entity.BonusCapacity;
import org.example.classes.entity.Capacity;
import org.example.classes.entity.Kingdom;
import org.example.classes.entity.Weapon;
import org.example.classes.entity.impl.Archer;
import org.example.classes.entity.impl.ArcherCapacity;
import org.example.classes.entity.impl.ArcherWeapon;
import org.example.classes.entity.impl.Sorcerer;
import org.example.classes.factory.impl.ArcherFactory;

public class Main {
    private static final Kingdom myKingdom = Kingdom.getInstance();
    public static void main(String[] args) {

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
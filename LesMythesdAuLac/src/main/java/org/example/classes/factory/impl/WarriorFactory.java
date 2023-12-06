package org.example.classes.factory.impl;

import org.example.classes.entity.BonusCapacity;
import org.example.classes.entity.Capacity;
import org.example.classes.entity.Character;
import org.example.classes.entity.Weapon;
import org.example.classes.entity.impl.Warrior;
import org.example.classes.entity.impl.WarriorBonusCapacity;
import org.example.classes.entity.impl.WarriorCapacity;
import org.example.classes.entity.impl.WarriorWeapon;
import org.example.classes.factory.CharacterFactory;

public class WarriorFactory extends CharacterFactory {
    private String weapon;
    private String physicalAttributes;
    private int capacityBonus;


    @Override
    public Character createCharacter() {
        return new Warrior();
    }

    @Override
    public Weapon createWeapon() {
        return new WarriorWeapon();
    }

    @Override
    public Capacity createCapacity() {
        return new WarriorCapacity();
    }

    @Override
    public BonusCapacity createBonusCapacity() {
        return new WarriorBonusCapacity();
    }


}

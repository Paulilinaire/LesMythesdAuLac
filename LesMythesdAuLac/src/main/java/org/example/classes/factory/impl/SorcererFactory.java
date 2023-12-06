package org.example.classes.factory.impl;

import org.example.classes.entity.BonusCapacity;
import org.example.classes.entity.Capacity;
import org.example.classes.entity.Character;
import org.example.classes.entity.Weapon;
import org.example.classes.entity.impl.Sorcerer;
import org.example.classes.entity.impl.SorcererBonusCapacity;
import org.example.classes.entity.impl.SorcererCapacity;
import org.example.classes.entity.impl.SorcererWeapon;
import org.example.classes.factory.CharacterFactory;

public class SorcererFactory extends CharacterFactory {
    private String magicType;
    private String staffType;
    private int capacityBonus;


    @Override
    public Character createCharacter() {
        return new Sorcerer();
    }

    @Override
    public Weapon createWeapon() {
        return new SorcererWeapon();
    }

    @Override
    public Capacity createCapacity() {
        return new SorcererCapacity();
    }

    @Override
    public BonusCapacity createBonusCapacity() {
        return new SorcererBonusCapacity();
    }

}

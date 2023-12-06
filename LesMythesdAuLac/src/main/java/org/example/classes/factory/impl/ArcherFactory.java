package org.example.classes.factory.impl;

import org.example.classes.entity.BonusCapacity;
import org.example.classes.entity.Capacity;
import org.example.classes.entity.Character;
import org.example.classes.entity.Weapon;
import org.example.classes.entity.impl.Archer;
import org.example.classes.entity.impl.ArcherBonusCapacity;
import org.example.classes.entity.impl.ArcherCapacity;
import org.example.classes.entity.impl.ArcherWeapon;
import org.example.classes.factory.CharacterFactory;

public class ArcherFactory extends CharacterFactory {
    private String bowType;
    private int capacityBonus;


    @Override
    public Character createCharacter() {
        return new Archer();
    }

    @Override
    public Weapon createWeapon() {
        return new ArcherWeapon();
    }

    @Override
    public Capacity createCapacity() {
        return new ArcherCapacity();
    }

    @Override
    public BonusCapacity createBonusCapacity() {
        return new ArcherBonusCapacity();
    }

}

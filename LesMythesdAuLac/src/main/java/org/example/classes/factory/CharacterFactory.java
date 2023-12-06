package org.example.classes.factory;

import org.example.classes.entity.BonusCapacity;
import org.example.classes.entity.Capacity;
import org.example.classes.entity.Character;
import org.example.classes.entity.Weapon;

public abstract class CharacterFactory {
    public abstract Character createCharacter();
    public abstract Weapon createWeapon();
    public abstract Capacity createCapacity();
    public abstract BonusCapacity createBonusCapacity();


}

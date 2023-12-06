package org.example.classes.entity.impl;

import org.example.classes.entity.Weapon;

public class SorcererWeapon extends Weapon {
    String weaponName;
    boolean acquired;
    String damageLevel;

    @Override
    public String getWeaponName() {
        return weaponName ;
    }

    @Override
    public boolean isAcquired() {
        return acquired;
    }
    public void setAcquired(boolean acquired){
        this.acquired = acquired;
    }

    @Override
    protected String damageLevel() {
        return damageLevel;
    }
}

package org.example.classes.entity.impl;

import org.example.classes.entity.Weapon;

public class ArcherWeapon extends Weapon {
    private String weaponName;
    private boolean acquired;
    private String damageLevel;

    private ArcherWeapon(Builder builder){
        weaponName = builder.weaponName;
        acquired = builder.acquired;
        damageLevel = builder.damageLevel;
    }

    public ArcherWeapon() {
    }

    @Override
    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public boolean isAcquired() {
        return acquired;
    }

    public void setAcquired(boolean acquired) {
        this.acquired = acquired;
    }

    @Override
    public String damageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(String damageLevel) {
        this.damageLevel = damageLevel;
    }

    @Override
    public String toString() {
        return "ArcherWeapon{" +
                "weaponName='" + weaponName + '\'' +
                ", acquired=" + acquired +
                ", damageLevel='" + damageLevel + '\'' +
                '}';
    }

    public static class Builder {
        private String weaponName;
        private boolean acquired;
        private String damageLevel;

        public Builder weaponName(String weaponName){
            this.weaponName= weaponName;
            return this;
        }

        public Builder acquired(boolean acquired) {
            this.acquired = acquired;
            return this;
        }

        public Builder damageLevel(String damageLevel) {
            this.damageLevel = damageLevel;
            return this;
        }

        public ArcherWeapon build(){return new ArcherWeapon(this);}
    }

}

package org.example.classes.entity.impl;

import org.example.classes.entity.Character;
import org.example.classes.entity.Weapon;

public class Archer extends Character {
    private String name;
    private int level;
    private int health;

    private Archer(Builder builder){
        name = builder.name;
        health = builder.health;
        level = builder.level;
    }

    public Archer() {
    }

    @Override
    protected String getCharacterName() {
        return name;
    }

    @Override
    protected int getCharacterLevel() {
        return level;
    }

    @Override
    protected int getCharacterHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }

    public static class Builder {
        private String name;
        private int level;
        private int health;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder level(int level){
            this.level = level;
            return this;
        }
        public Builder health(int health){
            this.health = health;
            return this;
        }

        public Archer build(){
            return new Archer(this);
        }
    }
}

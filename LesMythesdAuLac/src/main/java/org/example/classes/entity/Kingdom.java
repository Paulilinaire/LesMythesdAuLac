package org.example.classes.entity;

import java.util.ArrayList;
import java.util.List;

public class Kingdom {
    private static volatile Kingdom instance = null;
    private static final Object lock = new Object();
    private List<Building> buildingList;
    private List<Character> characterList;
    private String name;

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    private Kingdom() {
        buildingList = new ArrayList<>();
        characterList = new ArrayList<>();
    }

    public static Kingdom getInstance() { //singleton
        if(instance == null) {
            synchronized (lock) {
                instance = new Kingdom();
            }
        }
        return instance;
    }

    public static void display(List<Character> characterList) {
        for (Character c: characterList) {
            System.out.println(c);
        }
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kingdom{" +
                "buildingList=" + buildingList +
                ", characterList=" + characterList +
                ", name='" + name + '\'' +
                '}';
    }
}

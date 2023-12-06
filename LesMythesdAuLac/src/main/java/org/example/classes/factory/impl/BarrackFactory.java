package org.example.classes.factory.impl;

import org.example.classes.BuildingFactory;
import org.example.classes.entity.*;
import org.example.classes.entity.impl.personalisation.*;

public class BarrackFactory extends BuildingFactory {
    @Override
    public String getType() {
        return "Barracks";
    }

    @Override
    public Size createSize() {
        return new MediumSize();
    }

    @Override
    public AncientStyle createStyle() {
        return new AncientStyle();
    }

    @Override
    public CombatFunctionality createFunctional() {
        return new CombatFunctionality();
    }

    @Override
    public Building createBuilding() {
        return null;
    }

    //@Override
    /*public Building createBuilding() {
        return new Building.Builder() {
            @Override
            public Building build() {
                return new Barrack();
            }
        }
                .setSize(new MediumSize())
                .setFunctionality(new CombatFunctionality())
                .setStyle(new AncientStyle())
                .build();
        }*/

}
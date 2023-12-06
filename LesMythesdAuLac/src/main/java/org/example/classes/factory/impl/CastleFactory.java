package org.example.classes.factory.impl;

import org.example.classes.BuildingFactory;

import org.example.classes.entity.Building;
import org.example.classes.entity.Size;
import org.example.classes.entity.impl.personalisation.*;

public class CastleFactory extends BuildingFactory{

    @Override
    public String getType() {
        return  "Castle";
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

    /*@Override
        public Building createBuilding() {
            return new Building.Builder() {
                @Override
                public Building build() {
                    return new Castle();
                }
            }
                    .setSize(new MediumSize())
                    .setFunctionality(new ResidentialFunctionality())
                    .setStyle(new AncientStyle())
                    .build();
        }*/

}

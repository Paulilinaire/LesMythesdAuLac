package org.example.classes.factory.impl;

import org.example.classes.BuildingFactory;
import org.example.classes.entity.Building;
import org.example.classes.entity.Forge;
import org.example.classes.entity.Size;
import org.example.classes.entity.impl.personalisation.*;

public class ForgeFactory extends BuildingFactory {
    @Override
    public String getType() {
        return  "Forge";
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
        return new Forge.Builder() {
            @Override
            public Building build() {
                return new Forge();
            }
        }
                .setSize(new SmallSize())
                .setFunctionality(new DefenseFunctionality())
                .setStyle(new ClassicStyle())
                .build();
    }*/


}

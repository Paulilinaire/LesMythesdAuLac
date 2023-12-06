package org.example;


import org.example.classes.BuildingFactory;
import org.example.classes.entity.Building;
import org.example.classes.entity.Castle;
import org.example.classes.entity.impl.personalisation.MediumSize;
import org.example.classes.factory.impl.BarrackFactory;
import org.example.classes.factory.impl.CastleFactory;
import org.example.classes.factory.impl.ForgeFactory;

public class Main {
    public static void main(String[] args) {
        Castle castle = new Castle.Builder()
                .size("Large")
                .style("Classic")
                .functional("defense")
                .build();
        System.out.println(castle);

    }

}
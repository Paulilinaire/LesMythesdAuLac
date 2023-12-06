package org.example.classes.factory;

import org.example.entity.impl.Fonctional;
import org.example.entity.impl.Size;

import javax.swing.text.Style;

public  abstract class BuildingFactory {
    public  abstract Size createSize();
    public  abstract Style createStyle();
    public  abstract Fonctional createFonctional();
    public void constructBuilding(){
        Size size = createSize();
        Fonctional fonctional = createFonctional();
        Style style = createStyle();
        System.out.println("Constructing a building with Size: " + size.getSize() +
                ", Functionality: " + functionality.getFunctionality() +
                ", and Style: " + style.getStyle());

    }



}

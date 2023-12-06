package org.example.classes;

import org.example.classes.entity.Building;
import org.example.classes.entity.Size;
import org.example.classes.entity.impl.personalisation.AncientStyle;
import org.example.classes.entity.impl.personalisation.CombatFunctionality;

public  abstract class BuildingFactory {
    public abstract String getType();

    public  abstract Size createSize();
    public  abstract AncientStyle createStyle();
    public  abstract CombatFunctionality createFunctional();
    public abstract Building createBuilding();
    public void constructBuilding(){
        /*Building building = createBuilding();
        Size size = createSize();
        Functional functional = createFunctional();
        Style style = createStyle();

        building.setSize(size);
        building.setStyle((org.example.classes.entity.Style) style);
        building.setFunctional(functional);
*/

    }



}

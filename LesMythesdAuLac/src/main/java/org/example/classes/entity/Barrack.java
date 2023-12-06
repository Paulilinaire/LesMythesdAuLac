package org.example.classes.entity;

import org.example.classes.BuildingFactory;
import org.example.classes.entity.impl.personalisation.AncientStyle;
import org.example.classes.entity.impl.personalisation.CombatFunctionality;


public class Barrack extends Building {
    protected  String size;
    protected  String functional;
    protected  String style;

    public Barrack(Builder builder) {
        this.size = builder.size;
        this.functional = builder.functional;
        this.style = builder.style;
    }

    @Override
    public String getType() {
        return " Barrack";
    }
    public static class Builder {
        protected  String size;
        protected  String functional;
        protected  String style;

        public Builder size( String size) {
            this.size = size;
            return this;
        }

        public Builder functional( String functionality) {
            this.functional = functional;
            return this;
        }

        public Builder style( String style) {
            this.style = style;
            return this;
        }

        public Building build() {
            return new Barrack(this);
        }

    }

}
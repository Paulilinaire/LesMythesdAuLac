package org.example.classes.entity;

import org.example.classes.entity.Building;


public class Forge extends Building {
    protected String size;
    protected String functional;
    protected String style;

    public Forge(Builder builder) {
        this.size = builder.size;
        this.functional = builder.functional;
        this.style = builder.style;
    }

    public Forge() {

    }

    @Override
    public String getType() {
        return "Forge";
    }
    public static class Builder {
        protected String size;
        protected String functional;
        protected String style;

        public Forge.Builder size(String size) {
            this.size = size;
            return this;
        }

        public Forge.Builder functional(String functional) {
            this.functional = functional;
            return this;
        }

        public Forge.Builder style(String style) {
            this.style = style;
            return this;
        }

        public Building build() {
            return new Forge(this);
        }

    }
}
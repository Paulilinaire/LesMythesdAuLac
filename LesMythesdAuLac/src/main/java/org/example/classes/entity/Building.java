package org.example.classes.entity;

import java.util.ArrayList;
import java.util.List;

// Classe abstraite pour le bâtiment avec le pattern Builder
public abstract class Building {
    protected Size size;
    protected Functional functional;
    protected Style style;
    protected List<Character> specialCharacters;

    public abstract String getType();
    public void construct() {
        System.out.println("Constructing a " + getType() +
                " with Size: " + size.getSize() +
                ", Functionality: " + functional.getFunctional() +
                ", Style: " + style.getStyle());

        if (specialCharacters != null && !specialCharacters.isEmpty()) {
            System.out.println("Special Characters: " + specialCharacters);
        }


    }
    public static abstract class Builder {
        protected Size size;
        protected Functional functional;
        protected Style style;
        protected List<Character> specialCharacters;


        public Builder setSize(Size size) {
            this.size = size;
            return this;
        }

        public Builder setFunctionality(Functional functionality) {
            this.functional = functional;
            return this;
        }

        public Builder setStyle(Style style) {
            this.style = style;
            return this;
        }

        public Builder addSpecialCharacter(Character character) {
            if (specialCharacters == null) {
                specialCharacters = new ArrayList<>();
            }
            specialCharacters.add(character);
            return this;
        }



        public abstract Building build();
    }
}


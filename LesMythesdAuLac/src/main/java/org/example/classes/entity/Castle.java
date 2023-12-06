package org.example.classes.entity;


public class Castle extends Building {
    protected String size;
    protected  String functional;
    protected  String style;
      public Castle(Builder builder) {

        this.size = builder.size;
        this.functional = builder.functional;
        this.style = builder.style;
    }



    @Override
    public String toString() {
        return "Castle{" +
                "size='" + size + '\'' +
                ", functional='" + functional + '\'' +
                ", style='" + style + '\'' +
                '}';
    }

    @Override
    public String getType() {
        return "Castle";
    }
    public static class Builder {
        protected String size;
        protected String functional;
        protected String style;

        public Builder size( String size) {
            this.size = size;
            return this;
        }

        public Builder functional( String functionality) {
            this.functional = functionality;
            return this;
        }

        public Builder style( String style) {
            this.style = style;
            return this;
        }

        public Castle build() {
            return new Castle(this);
        }



    }

}



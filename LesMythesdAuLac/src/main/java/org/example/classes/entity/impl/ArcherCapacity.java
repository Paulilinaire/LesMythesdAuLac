package org.example.classes.entity.impl;

import org.example.classes.entity.BonusCapacity;
import org.example.classes.entity.Capacity;

public class ArcherCapacity extends Capacity {
    private String capacityName;
    private boolean acquired;
    private String capacityLevel;

    private ArcherCapacity(Builder builder){
        capacityName = builder.capacityName;
        acquired = builder.acquired;
        capacityLevel = builder.capacityLevel;
    }

    public ArcherCapacity() {
    }


    @Override
    protected String getCapacityName() {
        return capacityName;
    }

    @Override
    protected boolean isAcquired() {
        return acquired;
    }
    public void setAcquired(boolean acquired){
        this.acquired = acquired;
    }

    @Override
    protected String capacityLevel() {
        return capacityLevel;
    }

    public static class Builder {
        private String capacityName;
        private boolean acquired;
        private String capacityLevel;

        public Builder capacityName(String capacityName) {
            this.capacityName = capacityName;
            return this;
        }

        public Builder acquired(boolean acquired) {
            this.acquired = acquired;
            return this;
        }

        public Builder capacityLevel(String capacityLevel) {
            this.capacityLevel = capacityLevel;
            return this;
        }

        public Capacity build() {
            return new ArcherCapacity(this);
        }
    }
}

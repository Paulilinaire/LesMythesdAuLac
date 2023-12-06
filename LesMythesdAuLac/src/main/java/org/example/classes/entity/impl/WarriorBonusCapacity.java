package org.example.classes.entity.impl;

import org.example.classes.entity.BonusCapacity;

public class WarriorBonusCapacity extends BonusCapacity {
    private String capacityBonusName;
    private boolean acquired;
    private String capacityLevel;

    private WarriorBonusCapacity(Builder builder) {
        capacityBonusName = builder.capacityBonusName;
        acquired = builder.acquired;
        capacityLevel = builder.capacityLevel;
    }

    public WarriorBonusCapacity() {
    }

    @Override
    protected String getCapacityBonusName() {
        return capacityBonusName;
    }

    @Override
    protected boolean isAcquired() {
        return acquired;
    }

    public void setAcquired(boolean acquired) {
        this.acquired = acquired;
    }

    @Override
    protected String capacityLevel() {
        return capacityLevel;
    }

    @Override
    public String toString() {
        return "WarriorBonusCapacity{" +
                "capacityBonusName='" + capacityBonusName + '\'' +
                ", acquired=" + acquired +
                ", capacityLevel='" + capacityLevel + '\'' +
                '}';
    }

    public static class Builder {
        private String capacityBonusName;
        private boolean acquired;
        private String capacityLevel;

        public Builder capacityBonusName(String capacityBonusName) {
            this.capacityBonusName = capacityBonusName;
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

        public BonusCapacity build() {
            // Validate required fields
            if (capacityBonusName == null || capacityLevel == null) {
                throw new IllegalStateException("Capacity Bonus Name and Level are required.");
            }
            return new WarriorBonusCapacity(this);
        }
    }
}

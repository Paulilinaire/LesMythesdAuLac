package org.example.classes.entity;

import org.example.classes.entity.impl.ArcherBonusCapacity;

public abstract class BonusCapacity {
    protected abstract String getCapacityBonusName();
    protected abstract boolean isAcquired();
    protected abstract String capacityLevel();

}

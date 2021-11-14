package Planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                '}');
    }

    @Override
    public boolean equals(Object objectCheckedForEquality) {
        if (this == objectCheckedForEquality) return true;
        if (!(objectCheckedForEquality instanceof MilitaryPlane)) return false;
        if (!super.equals(objectCheckedForEquality)) return false;
        MilitaryPlane militaryPlaneType = (MilitaryPlane) objectCheckedForEquality;
        return militaryPlaneType == militaryPlaneType.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}

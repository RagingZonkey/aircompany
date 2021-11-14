package planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType militaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType militaryType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getMilitaryType() {
        return militaryType;
    }

    @Override
    public boolean equals(Object objectCheckedForEquality) {
        if (this == objectCheckedForEquality) return true;
        if ((objectCheckedForEquality instanceof MilitaryPlane) && super.equals(objectCheckedForEquality)) {
            return militaryType == ((MilitaryPlane) objectCheckedForEquality).militaryType;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryType +
                        '}');
    }

}

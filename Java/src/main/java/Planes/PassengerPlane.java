package planes;

import java.util.Objects;

public class PassengerPlane extends Plane{

    private int passengersCapacity;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }


    public int getPassengersCapacity() {
        return passengersCapacity;
    }


    @Override
    public boolean equals(Object objectCheckedForEquality) {
        if (this == objectCheckedForEquality) {
            return true;
        }
        if ((objectCheckedForEquality instanceof PassengerPlane) && super.equals(objectCheckedForEquality)) {
            return passengersCapacity == ((PassengerPlane) objectCheckedForEquality).passengersCapacity;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                        '}');
    }

}

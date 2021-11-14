import planes.ExperimentalPlane;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.*;
import java.util.stream.Collectors;


public class Airport {
    private List<? extends Plane> planes;


    public List<PassengerPlane> getPassengerPlanes() {
        return planes.stream().filter(plane -> plane instanceof PassengerPlane).map(plane ->
                (PassengerPlane) plane).collect(Collectors.toList());
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        return planes.stream().filter(plane -> plane instanceof MilitaryPlane).map(plane ->
                (MilitaryPlane) plane).collect(Collectors.toList());
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        return getPassengerPlanes().stream().max(Comparator.comparing(PassengerPlane::getPassengersCapacity)).get();
    }


    public List<ExperimentalPlane> getExperimentalPlanes() {
        return planes.stream().filter(plane -> plane instanceof ExperimentalPlane).map(plane ->
                (ExperimentalPlane) plane).collect(Collectors.toList());
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane firstPlane, Plane secondPlane) {
                return firstPlane.getMaxFlightDistance() - secondPlane.getMaxFlightDistance();
            }
        });
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane firstPlane, Plane secondPlane) {
                return firstPlane.getMaxSpeed() - secondPlane.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane firstPlane, Plane secondPlane) {
                return firstPlane.getMaxLoadCapacity() - secondPlane.getMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

}

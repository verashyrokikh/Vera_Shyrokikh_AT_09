package homework.day6.playground.processors;

import homework.day6.playground.essense.craft.Transportable;

import static homework.day5.playground.utils.CoordinatesGenerator.generateCoordinate;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        transportable.move(pointA, pointB);
        System.out.printf("Transportable %s was moved to %s points.\n", transportable.getClass().getSimpleName(), transportable.move(pointA, pointB));
    }

    public void runTransportable(Transportable transportable) {
        transportable.move(generateCoordinate(), generateCoordinate());
        System.out.printf("Transportable %s was moved to %s points.\n", transportable.getClass().getSimpleName(), transportable.move(generateCoordinate(), generateCoordinate()));
    }
}

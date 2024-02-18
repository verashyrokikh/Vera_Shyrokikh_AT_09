package homework.day5.playground.runners;

import homework.day5.playground.essense.Flyable;
import homework.day5.playground.essense.craft.air.Aircraft;
import homework.day5.playground.essense.craft.air.Copter;
import homework.day5.playground.essense.craft.air.Plane;
import homework.day5.playground.essense.craft.air.Rocket;
import homework.day5.playground.essense.creatures.Fly;
import homework.day5.playground.essense.creatures.Insect;
import homework.day5.playground.essense.creatures.Mosquito;
import homework.day5.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {
    public static void main(String[] args) {
        FlyableProcessor flyableProcessor = new FlyableProcessor();
        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        FlyableProcessor.runFlyable(flyableCopter);
        FlyableProcessor.runFlyable(flyablePlane);
        FlyableProcessor.runFlyable(flyableRocket);
        FlyableProcessor.runFlyable(flyableFly);
        FlyableProcessor.runFlyable(flyableMosquito);
        FlyableProcessor.runFlyable(aircraftCopter);
        FlyableProcessor.runFlyable(aircraftPlane);
        FlyableProcessor.runFlyable(aircraftRocket);
        //FlyableProcessor.runFlyable(insectFly);
        //FlyableProcessor.runFlyable(insectMosquito);
        //ошибка у этих двух объектов, т.к. они наследники класса Insect, который не имплементит интерфейс Flyable
        FlyableProcessor.runFlyable(aCopter);
        FlyableProcessor.runFlyable(aPlane);
        FlyableProcessor.runFlyable(aRocket);
        FlyableProcessor.runFlyable(aFly);
        FlyableProcessor.runFlyable(aMosquito);

        flyableProcessor.runFlyable(flyableFly, "nowhere");
        flyableProcessor.runFlyable(aircraftRocket, "everywhere");
    }
}

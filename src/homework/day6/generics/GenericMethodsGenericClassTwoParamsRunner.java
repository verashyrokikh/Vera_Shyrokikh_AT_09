package homework.day6.generics;

import homework.day6.playground.essense.craft.air.Copter;
import homework.day6.playground.essense.craft.air.Plane;
import homework.day6.playground.essense.craft.air.Rocket;
import homework.day6.playground.essense.craft.field.Car;
import homework.day6.playground.essense.craft.field.Moped;
import homework.day6.playground.essense.craft.field.Motorbike;
import homework.day6.playground.essense.craft.hand.Bottle;
import homework.day6.playground.essense.craft.hand.Can;
import homework.day6.playground.essense.craft.hand.Mug;
import homework.day6.playground.essense.creatures.*;
import homework.day6.playground.essense.material.Diesel;
import homework.day6.playground.essense.material.Petrol;
import homework.day6.playground.essense.material.Water;

public class GenericMethodsGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> string1 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> string2 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> string3 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, String> integer1 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> integer2 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Double> integer3 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Double, String> Double1 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Double, Integer> Double2 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Double, Double> double3 = new GenericMethodsInGenericClassTwoParams<>();

        GenericMethodsInGenericClassTwoParams<Copter, Plane> copter = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plane, Rocket> plane = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Car, Motorbike> romoped= new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Moped, Can> moped = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Mug> Bottle = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Beetle, Fly> fly = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mosquito, Flower> flower = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> carrot = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Maylily> maylily = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Potato> potato = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Radish, Raven> raven = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rose, Water> rose= new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Diesel, Petrol> petrol= new GenericMethodsInGenericClassTwoParams<>();

        string1.genericMethodGenArgs("dfvfv");
        string1.genericMethodGenArgs("dfvrve","sdfw");
        string1.genericMethodHalfGenArgs("sdfvsd");
        string1.genericMethodHalfGenArgs("szfdv ","sfvsf");
        string1.genericMethodHalfGenArgs("ssfg", "sgfv sbf", "sfvfv");

        string2.genericMethodGenArgs("dfvfv");
        string2.genericMethodGenArgs("dfvrve",3443);
        string2.genericMethodHalfGenArgs("sdfvsd");
        string2.genericMethodHalfGenArgs("szfdv ","sfvsf");
        string2.genericMethodHalfGenArgs("ssfg", 45636, "sfvfv");

    }
}

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
        GenericMethodsInGenericClassTwoParams<Double, String> double1 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Double, Integer> double2 = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Double, Double> double3 = new GenericMethodsInGenericClassTwoParams<>();

        GenericMethodsInGenericClassTwoParams<Copter, Plane> copter = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plane, Rocket> plane = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Car, Motorbike> car= new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Moped, Can> moped = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Mug> bottle = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Beetle, Fly> fly = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mosquito, Flower> flower = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Chamomile> carrot = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Maylily> maylily = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Pigeon, Potato> potato = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Radish, Raven> raven = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rose, Water> rose= new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Diesel, Petrol> petrol= new GenericMethodsInGenericClassTwoParams<>();

        string1.genericMethodGenArgs("dfvfv");
        System.out.println(string1.genericMethodGenArgs("dfvfv"));
        string1.genericMethodGenArgs("dfvrve","sdfw");
        System.out.println(string1.genericMethodGenArgs("dfvrve","sdfw"));
        string1.genericMethodHalfGenArgs("sdfvsd");
        string1.genericMethodHalfGenArgs("szfdv ","sfvsf");
        string1.genericMethodHalfGenArgs("ssfg", "sgfv sbf", "sfvfv");

        string2.genericMethodGenArgs("dfvfv");
        System.out.println(string2.genericMethodGenArgs("dfvfv"));
        string2.genericMethodGenArgs("dfvrve",3443);
        System.out.println(string2.genericMethodGenArgs("dfvrve",3443));
        string2.genericMethodHalfGenArgs("sdfvsd");
        string2.genericMethodHalfGenArgs("szfdv ","sfvsf");
        string2.genericMethodHalfGenArgs("ssfg", 45636, "sfvfv");

        string3.genericMethodGenArgs("dfvfv");
        System.out.println(string3.genericMethodGenArgs("dfvfv"));
        string3.genericMethodGenArgs("dfvrve",34.65);
        System.out.println(string3.genericMethodGenArgs("dfvrve",34.65));
        string3.genericMethodHalfGenArgs("sdfvsd");
        string3.genericMethodHalfGenArgs("szfdv ","sfvsf");
        string3.genericMethodHalfGenArgs("ssfg", 23.45, "sfvfv");

        integer1.genericMethodGenArgs(2456);
        System.out.println(integer1.genericMethodGenArgs(2456));
        integer1.genericMethodGenArgs(346,"sdfw");
        System.out.println(integer1.genericMethodGenArgs(346,"sdfw"));
        integer1.genericMethodHalfGenArgs(345);
        integer1.genericMethodHalfGenArgs(345,"sfvsf");
        integer1.genericMethodHalfGenArgs(3445, "sgfv sbf", "sfvfv");

        integer2.genericMethodGenArgs(2456);
        System.out.println(integer2.genericMethodGenArgs(2456));
        integer2.genericMethodGenArgs(346,3);
        System.out.println(integer2.genericMethodGenArgs(346,3));
        integer2.genericMethodHalfGenArgs(345);
        integer2.genericMethodHalfGenArgs(345,"sfvsf");
        integer2.genericMethodHalfGenArgs(3445, 3, "sfvfv");

        integer3.genericMethodGenArgs(2456);
        System.out.println(integer3.genericMethodGenArgs(2456));
        integer3.genericMethodGenArgs(346,3.5);
        System.out.println(integer3.genericMethodGenArgs(346,3.5));
        integer3.genericMethodHalfGenArgs(345);
        integer3.genericMethodHalfGenArgs(345,"sfvsf");
        integer3.genericMethodHalfGenArgs(3445, 3.2, "sfvfv");

        double1.genericMethodGenArgs(2.4);
        System.out.println(double1.genericMethodGenArgs(2.4));
        double1.genericMethodGenArgs(346.5,"sfver");
        System.out.println(double1.genericMethodGenArgs(346.5,"sfver"));
        double1.genericMethodHalfGenArgs(345.4);
        double1.genericMethodHalfGenArgs(345.4,"sfvsf");
        double1.genericMethodHalfGenArgs(3445.4, "sdfc", "sfvfv");

        double2.genericMethodGenArgs(2.6);
        System.out.println(double2.genericMethodGenArgs(2.6));
        double2.genericMethodGenArgs(3.6,3);
        System.out.println(double2.genericMethodGenArgs(3.6,3));
        double2.genericMethodHalfGenArgs(3.5);
        double2.genericMethodHalfGenArgs(3.5,"sfvsf");
        double2.genericMethodHalfGenArgs(3.5, 3, "sfvfv");

        double3.genericMethodGenArgs(2.6);
        System.out.println(double3.genericMethodGenArgs(2.6));
        double3.genericMethodGenArgs(3.6,3.9);
        System.out.println(double3.genericMethodGenArgs(3.6,3.9));
        double3.genericMethodHalfGenArgs(3.5);
        double3.genericMethodHalfGenArgs(3.5,"sfvsf");
        double3.genericMethodHalfGenArgs(3.5, 3.6, "sfvfv");

        copter.genericMethodGenArgs(new Copter(24, "heli1"));
        System.out.println(copter.genericMethodGenArgs(new Copter(24, "heli1")));
        copter.genericMethodGenArgs(new Copter(223, "Mi8 Flyable"), new Plane(3452, "Boeing 837 Flyable"));
        System.out.println(copter.genericMethodGenArgs(new Copter(223, "Mi8 Flyable"), new Plane(3452, "Boeing 837 Flyable")));
        copter.genericMethodHalfGenArgs(new Copter(223, "Mi8 Flyable"), "hello");
        copter.genericMethodHalfGenArgs(new Copter(330, "Heli"));
        copter.genericMethodHalfGenArgs(new Copter(223, "Mi8 Flyable"), new Plane(3452, "Boeing 837 Flyable"), "sfhsdf");

        plane.genericMethodGenArgs(new Plane(3452, "Boeing 837 Flyable"));
        System.out.println(plane.genericMethodGenArgs(new Plane(3452, "Boeing 837 Flyable")));
        plane.genericMethodGenArgs(new Plane(3452, "Boeing 837 Aircraft"), new Rocket(7623, "Super Heavy Flyable"));
        System.out.println(plane.genericMethodGenArgs(new Plane(3452, "Boeing 837 Aircraft"), new Rocket(7623, "Super Heavy Flyable")));
        plane.genericMethodHalfGenArgs(new Plane(223, "Mi8 Flyable"), "hello");
        plane.genericMethodHalfGenArgs(new Plane(3452, "Boeing 837 Flyable"));
        plane.genericMethodHalfGenArgs(new Plane(3452, "Boeing 837 Aircraft"), new Rocket(7623, "Super Heavy Rocket"), "sfhsdf");

        car.genericMethodGenArgs(new Car(223, "Lada Rideable"));
        System.out.println(car.genericMethodGenArgs(new Car(223, "Lada Rideable")));
        car.genericMethodGenArgs(new Car(223, "Lada Vehicle"), new Motorbike(7623, "Suzuki GSX-R1000 Rideable"));
        System.out.println(car.genericMethodGenArgs(new Car(223, "Lada Vehicle"), new Motorbike(7623, "Suzuki GSX-R1000 Rideable")));
        car.genericMethodHalfGenArgs(new Car(223, "Audi Car"), "hello");
        car.genericMethodHalfGenArgs(new Car(223, "Lada Vehicle"));
        car.genericMethodHalfGenArgs(new Car(223, "Lada Car"), new Motorbike(7623, "Suzuki GSX-R1000 Motorbike"), "vrrrr");

        moped.genericMethodGenArgs(new Moped(3452, "Honda EM1 837 Rideable"));
        System.out.println(moped.genericMethodGenArgs(new Moped(3452, "Honda EM1 837 Rideable")));
        moped.genericMethodGenArgs(new Moped(3452, "Honda EM1 837 Rideable"), new Can(562, "plastic"));
        System.out.println(moped.genericMethodGenArgs(new Moped(3452, "Honda EM1 837 Rideable"), new Can(562, "plastic")));
        moped.genericMethodHalfGenArgs(new Moped(3452, "Honda EM1 837 Rideable"), "hello");
        moped.genericMethodHalfGenArgs(new Moped(3452, "Honda EM1 837 Moped"));
        moped.genericMethodHalfGenArgs(new Moped(3452, "Honda EM1 837 Vehicle"), new Can(34, "ceramics"), "700ml");

        bottle.genericMethodGenArgs(new Bottle(23, "Glass"));
        System.out.println(bottle.genericMethodGenArgs(new Bottle(23, "Glass")));
        bottle.genericMethodGenArgs(new Bottle(4, "Plastic"), new Mug(8, "extra large"));
        System.out.println(bottle.genericMethodGenArgs(new Bottle(4, "Plastic"), new Mug(8, "extra large")));
        bottle.genericMethodHalfGenArgs(new Bottle(23, "Glass"), "hello");
        bottle.genericMethodHalfGenArgs(new Bottle(4, "Plastic"));
        bottle.genericMethodHalfGenArgs(new Bottle(33, "Blue"), new Mug(5, "Plastic"), "sfhsdf");

        fly.genericMethodGenArgs(new Beetle(43, "Christmas Crawlable"));
        System.out.println(fly.genericMethodGenArgs(new Beetle(43, "Christmas Crawlable")));
        fly.genericMethodGenArgs(new Beetle(43, "Christmas Beetle"), new Fly(23, "Domestica Flyable"));
        System.out.println(fly.genericMethodGenArgs(new Beetle(43, "Christmas Beetle"), new Fly(23, "Domestica Flyable")));
        fly.genericMethodHalfGenArgs(new Beetle(43, "Christmas Insect"), "hello");
        fly.genericMethodHalfGenArgs(new Beetle(43, "Christmas Insect"));
        fly.genericMethodHalfGenArgs(new Beetle(36, "Boring Insect"), new Fly(23, "Domestica Fly"), "sfhsdf");

        flower.genericMethodGenArgs(new Mosquito(12, "Vulgaris Flyable"));
        System.out.println(flower.genericMethodGenArgs(new Mosquito(12, "Vulgaris Flyable")));
        flower.genericMethodGenArgs(new Mosquito(12, "Vulgaris Mosquito"), new Flower(4, "Blue"));
        System.out.println(flower.genericMethodGenArgs(new Mosquito(12, "Vulgaris Mosquito"), new Flower(4, "Blue")));
        flower.genericMethodHalfGenArgs(new Mosquito(12, "Vulgaris Flyable"));
        flower.genericMethodHalfGenArgs(new Mosquito(12, "Vulgaris Insect"), new Flower(3, "magnificant"), "nice");

        carrot.genericMethodGenArgs(new Carrot(1, "Orange"));
        System.out.println(carrot.genericMethodGenArgs(new Carrot(1, "Orange")));
        carrot.genericMethodGenArgs(new Carrot(1, "Purple"), new Chamomile(1, "pharma"));
        System.out.println(carrot.genericMethodGenArgs(new Carrot(1, "Purple"), new Chamomile(1, "pharma")));
        carrot.genericMethodHalfGenArgs(new Carrot(1, "Yellow"), "hello");
        carrot.genericMethodHalfGenArgs(new Carrot(1, "Yellow"));
        carrot.genericMethodHalfGenArgs(new Carrot(1, "Juicy"), new Chamomile(1, "Tea"), "For tea");

        maylily.genericMethodGenArgs(new Crocodile(1723, "Neel Crawlable"));
        System.out.println(maylily.genericMethodGenArgs(new Crocodile(1723, "Neel Crawlable")));
        maylily.genericMethodGenArgs(new Crocodile(1723, "Neel Vertebrata"), new Maylily(23, "Pink"));
        System.out.println(maylily.genericMethodGenArgs(new Crocodile(1723, "Neel Vertebrata"), new Maylily(23, "Pink")));
        maylily.genericMethodHalfGenArgs(new Crocodile(1723, "Gena Crocodile"), "hello");
        maylily.genericMethodHalfGenArgs(new Crocodile(1723, "Neel Crawlable"));
        maylily.genericMethodHalfGenArgs(new Crocodile(1723, "Neel Vertebrata"), new Maylily(3, "Garden perles"), "for sale");

        potato.genericMethodGenArgs(new Pigeon(3, "Mails deliver"));
        System.out.println(potato.genericMethodGenArgs(new Pigeon(3, "Mails deliver")));
        potato.genericMethodGenArgs(new Pigeon(4, "City grey"), new Potato(1, "Very big yellow"));
        System.out.println(potato.genericMethodGenArgs(new Pigeon(4, "City grey"), new Potato(1, "Very big yellow")));
        potato.genericMethodHalfGenArgs(new Pigeon(2, "Food"), "hello");
        potato.genericMethodHalfGenArgs(new Pigeon(4, "City white"));
        potato.genericMethodHalfGenArgs(new Pigeon(2, "Food"), new Potato(1, "Very big yellow"), "For french fries");

        raven.genericMethodGenArgs(new Radish(2, "Pink"));
        System.out.println(raven.genericMethodGenArgs(new Radish(2, "Pink")));
        raven.genericMethodGenArgs(new Radish(2, "Pink-white"), new Raven(7, "Smart"));
        System.out.println(raven.genericMethodGenArgs(new Radish(2, "Pink-white"), new Raven(7, "Smart")));
        raven.genericMethodHalfGenArgs(new Radish(2, "Red"), "hello");
        raven.genericMethodHalfGenArgs(new Radish(2, "Spicy"));
        raven.genericMethodHalfGenArgs(new Radish(2, "Pink-white"), new Raven(7, "Home pet"), "Smart talkative pet");

        rose.genericMethodGenArgs(new Rose(2, "White"));
        System.out.println(rose.genericMethodGenArgs(new Rose(2, "White")));
        rose.genericMethodGenArgs(new Rose(3, "Pink"), new Water(4));
        System.out.println(rose.genericMethodGenArgs(new Rose(3, "Pink"), new Water(4)));
        rose.genericMethodHalfGenArgs(new Rose(3, "Yellow"), "hello");
        rose.genericMethodHalfGenArgs(new Rose(4, "Tender Red"));
        rose.genericMethodHalfGenArgs(new Rose(3, "Yellow"), new Water(2), "Mint");

        petrol.genericMethodGenArgs(new Diesel(4));
        System.out.println(petrol.genericMethodGenArgs(new Diesel(4)));
        petrol.genericMethodGenArgs(new Diesel(8), new Petrol(8));
        System.out.println(petrol.genericMethodGenArgs(new Diesel(8), new Petrol(8)));
        petrol.genericMethodHalfGenArgs(new Diesel(6), "Christmas hello");
        petrol.genericMethodHalfGenArgs(new Diesel(5));
        petrol.genericMethodHalfGenArgs(new Diesel(4), new Petrol(2), "Small can");
    }
}

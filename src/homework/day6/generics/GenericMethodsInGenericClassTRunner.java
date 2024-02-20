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

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericsMethodsGenericClassT<String> newString = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Integer> newInteger = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Double> newDouble = new GenericsMethodsGenericClassT<>();

        GenericsMethodsGenericClassT<Copter> copter = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Plane> plane = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Rocket> rocket = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Car> car = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Moped> moped = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Motorbike> motorbike = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Bottle> bottle = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Can> can = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Mug> mug = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Beetle> beetle = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Carrot> carrot = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Chamomile> chamomile = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Crocodile> crocodile = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Fly> fly = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Maylily> maylily = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Mosquito> mosquito = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Pigeon> pigeon = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Potato> potato = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Radish> radish = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Raven> raven = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Rose> rose = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Diesel> diesel = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Petrol> petrol = new GenericsMethodsGenericClassT<>();
        GenericsMethodsGenericClassT<Water> water = new GenericsMethodsGenericClassT<>();

        newString.genericMethodOneGenArg("Hi");
        newString.genericMethodTwoGenArgs("Yes", "No");
        System.out.println(newString.genericMethodTwoGenArgs("Yes", "No"));
        newString.genericMethodHalfGenArgs("Hello", "text");

        newInteger.genericMethodOneGenArg(35);
        newInteger.genericMethodTwoGenArgs(33, 87);
        newInteger.genericMethodHalfGenArgs(55, "rthowe");

        newDouble.genericMethodOneGenArg(5.4);
        newDouble.genericMethodTwoGenArgs(5.3, 4.3);
        newDouble.genericMethodHalfGenArgs(5.3, "qrfqrqrt");

        copter.genericMethodOneGenArg(new Copter(223, "Mi8 Flyable"));
        copter.genericMethodTwoGenArgs(new Copter(223, "Mi8 Flyable"), new Copter(223, "Mi8 Copter"));
        copter.genericMethodHalfGenArgs(new Copter(330, "Heli"), "I fly there");

        plane.genericMethodOneGenArg(new Plane(3452, "Boeing 837 Flyable"));
        plane.genericMethodTwoGenArgs(new Plane(3452, "Boeing 837 Flyable"), new Plane(3452, "Boeing 837 Aircraft"));
        plane.genericMethodHalfGenArgs(new Plane(3452, "Boeing 837 Plane"), "There!");

        rocket.genericMethodOneGenArg(new Rocket(7623, "Super Heavy Flyable"));
        rocket.genericMethodTwoGenArgs(new Rocket(7623, "Super Heavy Flyable"), new Rocket(7623, "Super Heavy Aircraft"));
        rocket.genericMethodHalfGenArgs(new Rocket(7623, "Super Heavy Rocket"), "Start!");

        car.genericMethodOneGenArg(new Car(223, "Lada Rideable"));
        car.genericMethodTwoGenArgs(new Car(223, "Lada Vehicle"), new Car(223, "Lada Car"));
        car.genericMethodHalfGenArgs(new Car(223, "Audi Car"), "Put the belt on");

        moped.genericMethodOneGenArg(new Moped(3452, "Honda EM1 837 Rideable"));
        moped.genericMethodTwoGenArgs(new Moped(3452, "Honda EM1 837 Rideable"), new Moped(3452, "Honda EM1 837 Vehicle"));
        moped.genericMethodHalfGenArgs(new Moped(3452, "Honda EM1 837 Moped"), "drrrrr");

        motorbike.genericMethodOneGenArg(new Motorbike(7623, "Suzuki GSX-R1000 Rideable"));
        motorbike.genericMethodTwoGenArgs(new Motorbike(7623, "Suzuki GSX-R1000 Rideable"), new Motorbike(7623, "Suzuki GSX-R1000 Vehicle"));
        motorbike.genericMethodHalfGenArgs(new Motorbike(7623, "Suzuki GSX-R1000 Motorbike"), "vrrrr");

        bottle.genericMethodOneGenArg(new Bottle(23, "Glass"));
        bottle.genericMethodTwoGenArgs(new Bottle(23, "Glass"), new Bottle(4, "Plastic"));
        bottle.genericMethodHalfGenArgs(new Bottle(33, "Blue"), "still");

        can.genericMethodOneGenArg(new Can(23, "Wooden"));
        can.genericMethodTwoGenArgs(new Can(82, "Small"), new Can(54, "Big"));
        can.genericMethodHalfGenArgs(new Can(8, "Old"), "opened");

        mug.genericMethodOneGenArg(new Mug(5, "Plastic"));
        mug.genericMethodTwoGenArgs(new Mug(3, "small"), new Mug(5, "large"));
        mug.genericMethodHalfGenArgs(new Mug(8, "extra large"), "700ml");

        beetle.genericMethodOneGenArg(new Beetle(43, "Christmas Crawlable"));
        beetle.genericMethodTwoGenArgs(new Beetle(43, "Christmas Crawlable"), new Beetle(43, "Christmas Insect"));
        beetle.genericMethodHalfGenArgs(new Beetle(43, "Christmas Beetle"), "Merry colours");

        carrot.genericMethodOneGenArg(new Carrot(1, "Orange"));
        carrot.genericMethodTwoGenArgs(new Carrot(1, "Purple"), new Carrot(1, "Yellow"));
        carrot.genericMethodHalfGenArgs(new Carrot(1, "Juicy"), "for juice");

        chamomile.genericMethodOneGenArg(new Chamomile(1, "pharma"));
        chamomile.genericMethodTwoGenArgs(new Chamomile(1, "Big flowers"), new Chamomile(1, "Small flowers"));
        chamomile.genericMethodHalfGenArgs(new Chamomile(1, "Tea"), "For tea");

        crocodile.genericMethodOneGenArg(new Crocodile(1723, "Neel Crawlable"));
        crocodile.genericMethodTwoGenArgs(new Crocodile(1723, "Neel Crawlable"), new Crocodile(1723, "Neel Vertebrata"));
        crocodile.genericMethodHalfGenArgs(new Crocodile(1723, "Gena Crocodile"), "Friend");

        fly.genericMethodOneGenArg(new Fly(23, "Domestica Flyable"));
        fly.genericMethodTwoGenArgs(new Fly(23, "Domestica Flyable"), new Fly(23, "Domestica Insect"));
        fly.genericMethodHalfGenArgs(new Fly(23, "Domestica Fly"), "zzzz");

        maylily.genericMethodOneGenArg(new Maylily(23, "Pink"));
        maylily.genericMethodTwoGenArgs(new Maylily(2, "Forest"), new Maylily(2, "Garden"));
        maylily.genericMethodHalfGenArgs(new Maylily(3, "Garden perles"), "for sale");

        mosquito.genericMethodOneGenArg(new Mosquito(12, "Vulgaris Flyable"));
        mosquito.genericMethodTwoGenArgs(new Mosquito(12, "Vulgaris Flyable"), new Mosquito(12, "Vulgaris Insect"));
        mosquito.genericMethodHalfGenArgs(new Mosquito(12, "Vulgaris Mosquito"), "bloodsucker");

        pigeon.genericMethodOneGenArg(new Pigeon(3, "Mails deliver"));
        pigeon.genericMethodTwoGenArgs(new Pigeon(4, "City grey"), new Pigeon(4, "City white"));
        pigeon.genericMethodHalfGenArgs(new Pigeon(2, "Food"), "Fancy dinner");

        potato.genericMethodOneGenArg(new Potato(1, "Big Yellow"));
        potato.genericMethodTwoGenArgs(new Potato(1, "Red"), new Potato(1, "White"));
        potato.genericMethodHalfGenArgs(new Potato(1, "Very big yellow"), "For french fries");

        radish.genericMethodOneGenArg(new Radish(2, "Pink"));
        radish.genericMethodTwoGenArgs(new Radish(2, "Pink-white"), new Radish(2, "Red"));
        radish.genericMethodHalfGenArgs(new Radish(2, "Spicy"), "For side dishes");

        raven.genericMethodOneGenArg(new Raven(7, ",Black"));
        raven.genericMethodTwoGenArgs(new Raven(7, "Smart"), new Raven(7, "Talkative"));
        raven.genericMethodHalfGenArgs(new Raven(7, "Home pet"), "Smart talkative pet");

        rose.genericMethodOneGenArg(new Rose(2, "White"));
        rose.genericMethodTwoGenArgs(new Rose(3, "Pink"), new Rose(3, "Yellow"));
        rose.genericMethodHalfGenArgs(new Rose(4, "Tender Red"), "Most popular");

        diesel.genericMethodOneGenArg(new Diesel(4));
        diesel.genericMethodTwoGenArgs(new Diesel(6), new Diesel(8));
        diesel.genericMethodHalfGenArgs(new Diesel(5), "For tractors");

        petrol.genericMethodOneGenArg(new Petrol(4));
        petrol.genericMethodTwoGenArgs(new Petrol(9), new Petrol(8));
        petrol.genericMethodHalfGenArgs(new Petrol(2), "Small can");

        water.genericMethodOneGenArg(new Water(4));
        water.genericMethodTwoGenArgs(new Water(5), new Water(8));
        water.genericMethodHalfGenArgs(new Water(2), "Mint");
    }
}

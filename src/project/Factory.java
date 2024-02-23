////в нем создать 3 бутылки, объёмом 0.05, 0.1, 0.2 лира с газировкой, температура которой 12, 18 и 25 градусов соответственно
////добавить газировку в бутылки и наполнить пузырьками
////открыть поочередно все бутылки и выпустить из них газ
//
package project;

public class Factory {
    public static void main(String[] args) {
        Bottle bottleFirst = new Bottle(0.05, 12);
        Bottle bottleSecond = new Bottle(0.1, 18);
        Bottle bottleThird = new Bottle(0.2, 25);
       // bottleFirst.setWater();
       // bottleSecond.setWater();
        //bottleThird.setWater();
        bottleFirst.open();
        bottleSecond.open();
        bottleThird.open();

    }
}

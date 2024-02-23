////содеждит приватные поля double volume, Water water
////содержит конструктор Bottle(double volume), в котором сетается обьем бутылки
////есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened();)
////
////есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
////есть публичные методы Water getWater() и setWater(Water water) возвращающий/добавляющий обьект воды
////есть публичный невозвратный метод setBubbles(), который генерирует массив из обьектов Bubble размерностью 10 тыс пузырьков на 1 литр воды и сетает его в воду

package project;

public class Bottle {
    private double volume;
    int temperature;
    private Water water;

    public Bottle(double volume, int temperature) {
        this.volume = volume;
        this.temperature = temperature;
    }

    public void open() {
        this.water.setOpened();
        System.out.println("Bottle of water is opened");
    }

    public void warm(int temperature) {
        water.setTemperature(temperature);
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void setBubbles() {

        int[] Bubbles = new int[];

        if (volume==1){

        }

    }

}
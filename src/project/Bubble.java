//содеждит приватные поля double volume = 0.3, String gas;
//содержит конструктор Bubble(String gas), в который передается строка с названием газа пузырька
//есть публичный метод void cramp(), который в консоль выводит слово "Cramp!"
//есть публичный метод double getVolume(), возвращающий обьем пузырька

package project;

public class Bubble {
    public double volume;
    public String name;

    public Bubble(double volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    public double getVolume() {
        return this.volume;
    }
}


//- создать класс Pineapple и в нем
//-- строковое поле grade
//-- дробное числовое поле heatCapacity
//-- конструктор, принимающий сорт и теплоемкость и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printPineappleDetails, который сравнивает теплоемкость ананаса с 2140 и если она больше, то печатает в консоль "Я ананас, теплоемкость которого больше, чем у ветчины", в противном случае печатает в консоль "В ветчине тепла запасется больше :("

package homework.day1.basetask;

public class Pineapple {
    String grade;
    Double heatCapacity;

    public Pineapple(String grade, Double heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(Double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }
    public void printPineappleDetails(){
        if (heatCapacity > 2140) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        }else {
            System.out.println("В ветчине тепла запасется больше :(");
        }
    }

}

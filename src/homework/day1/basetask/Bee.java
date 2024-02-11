//- создать класс Bee и в нем
//-- строковое поле gender
//-- длинное целочисленное поле weight
//-- конструктор, принимающий пол и массу и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printBeeDetails, который делит 500 кг на массу пчелы
// и печатает в консоль информацию о ней в виде "Я легче лося в <> раз"

package homework.day1.basetask;

public class Bee {
    private String gender;
    private double weight;

    Bee(String gender, double weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        int weightComparison = (int) (500/weight);
        System.out.println("Я легче лося в " + weightComparison+ " раз");

    }
}


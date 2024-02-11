//создать класс TrainMethodsString и в нем
//создать невозвратный метод printMama, который ничего не принимает на вход печатает в консоль «мама мыла раму»
//создать невозвратный метод printPapa, который ничего не принимает на вход печатает в консоль «папа мыла раму»
//создать невозвратный метод printString, который принимает на вход строку и печатает в консоль эту строку
//создать невозвратный метод printMamaString, который принимает на вход строку и печатает в консоль «мама мыла » и эту строку

package homework.day1.basetask;

public class TrainMethodsString {

    public void printMama() {
        System.out.println("мама мыла раму");
    }

    public void printPapa() {
        System.out.println("папа мыла раму");
    }

    public void printString(String randomString) {
        System.out.println(randomString);
    }

    public void printMamaString(String anotherString) {
        System.out.println("Мама мыла " + anotherString);
    }


}


//создать класс TrainMethodsIfRunner с методом main, в котором создать обьект класса TrainMethodsIf,
// и отпечатать в консоль значение, возвращаемое каждым из его методов в виде "метод <название метода> вернул "
// и возвращаемое значение, последний метод просто вызвать

package homework.day1.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf methodsIf = new TrainMethodsIf();
        methodsIf.returnNewInt(18);
        methodsIf.returnNewLong(120);
        methodsIf.returnNewChar('g');
        methodsIf.returnNewFloat(0.67F);
        methodsIf.returnNewDouble(600);
        methodsIf.returnNewBoolean(false);
    }
}

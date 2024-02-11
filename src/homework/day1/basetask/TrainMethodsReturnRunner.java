//создать класс TrainMethodsReturnRunner с методом main,
// в котором создать обьект класса TrainMethodsReturn, и отпечатать в консоль значение,
// возвращаемое каждым из его методов в виде
// "метод <название метода> вернул " и возвращаемое значение

package homework.day1.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn methodsReturn = new TrainMethodsReturn();
        methodsReturn.returnNewInt(7);
        methodsReturn.returnNewLong(14124);
        methodsReturn.returnNewChar('J');
        methodsReturn.returnNewFloat(0.124F);
        methodsReturn.returnNewDouble(0.16);
        methodsReturn.returnNewShort((short) 99);
        methodsReturn.returnNewByte((byte) 4);
        methodsReturn.returnNewBoolean(true);
    }
}

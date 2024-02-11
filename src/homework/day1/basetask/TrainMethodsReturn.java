//- создать класс TrainMethodsReturn и в нем:
//- создать метод returnNewInt, который принимает на вход целое число (int) и возвращает это число умноженное на 3
//- создать метод returnNewLong, который принимает на вход целое число (long) и возвращает это число минус 4
//- создать метод returnNewChar, который принимает на вход символ (char) и возвращает строку из двух таких символов
//- создать метод returnNewFloat, который принимает на вход дробное число (float) и возвращает это число деленное на 2
//- создать метод returnNewDouble, который принимает на вход дробное число (double) и возвращает это число плюс 8
//- создать метод returnNewShort, который принимает на вход целое число (short) и возвращает это число минус 1
//- создать метод returnNewByte, который принимает на вход целое число (byte) и возвращает это число умноженное на 2
//- создать метод returnNewBoolean, который принимает на вход булево значение (boolean) и возвращает обратное булево

package homework.day1.basetask;

public class TrainMethodsReturn {
    public void returnNewInt(int newInt) {
        System.out.println("метод returnNewInt() вернул " + newInt * 3);
    }

    public void returnNewLong(long newLong) {
        System.out.println("метод returnNewLong() вернул " + (newLong - 4));
    }

    public void returnNewChar(char newChar) {
        System.out.println(newChar+newChar);
    }

    public void returnNewFloat(float newFloat) {
        System.out.println(newFloat / 2);
    }

    public void returnNewDouble(double newDouble) {
        System.out.println(newDouble + 8);
    }

    public void returnNewShort(short newShort) {
        System.out.println(newShort - 1);
    }

    public void returnNewByte(byte newByte) {
        System.out.println(newByte * 2);
    }

    public void returnNewBoolean(boolean newBoolean) {
        System.out.println(!newBoolean);
    }
}

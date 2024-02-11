//- создать класс TrainMethodsIf и в нем
//создать метод returnNewInt, который принимает на вход целое число (int) и если оно меньше 8,
// то возвращает это число умноженное на 7, в противном случае деленное на 4
//создать метод returnNewLong, который принимает на вход целое число (long) и если оно больше 300,
// то возвращает это число минус 300, в противном случае плюс 20
//создать метод returnNewChar, который принимает на вход символ (char) и если это 'g',
// то возвращает строку "go", в противном случае строку из этого символа с префиксом "o"
//создать метод returnNewFloat, который принимает на вход дробное число (float) и если оно равно 0.67,
// то возвращает это число, в противном случае число умноженное на 2
//создать метод returnNewDouble, который принимает на вход дробное число (double) и если оно больше 30, но меньше 80,
// то возвращает это число плюс 87, если оно больше 80, но меньше 400, то возвращает это число минус 87, а если оно больше 400, то деленное на 4, в остальных случаях возвращает само число
//создать невозвратный метод returnNewBoolean, который принимает на вход булево значение (boolean) и если оно true,
// то печатает в консоль "Я получил на вход значение истины", в противном случае печатает в консоль "Я получил на вход ложь"


package homework.day1.basetask;

public class TrainMethodsIf {
    public void returnNewInt(int newInt) {
        int resultInt;
        if (newInt < 8) {
            resultInt = newInt * 7;
        } else {
            resultInt = newInt / 4;
        }
        System.out.println("метод returnNewInt вернул " + resultInt);
    }

    public void returnNewLong(long newLong) {
        long resultLong;
        if (newLong > 300) {
            resultLong = newLong - 300;
        } else {
            resultLong = newLong + 20;
        }
        System.out.println("метод returnNewLong вернул " + resultLong);
    }

    public void returnNewChar(char newChar) {
        String resultChar;
        if (newChar == 'g') {
            resultChar = "go";
        } else {
            resultChar = "o" + newChar;
        }
        System.out.println("метод returnNewChar вернул " + resultChar);
    }

    public void returnNewFloat(float newFloat) {
        float resultFloat;
        if (newFloat == 0.67) {
            resultFloat = newFloat;
        } else {
            resultFloat = newFloat * 2;
        }
        System.out.println("метод returnNewFloat вернул " + resultFloat);
    }

    public void returnNewDouble(double newDouble) {
        double resultDouble;
        if (30 < newDouble) {
            if (newDouble < 80) {
                resultDouble = newDouble + 87;
                System.out.println(resultDouble);
            } else if (newDouble < 400) {
                resultDouble = newDouble - 87;
                System.out.println(resultDouble);
            } else if (newDouble > 400) {
                resultDouble = newDouble / 4;
                System.out.println("метод returnNewDouble вернул " + resultDouble);
            }
        } else
            System.out.println("метод returnNewDouble вернул " +newDouble);
    }

    public void returnNewBoolean(boolean newBoolean) {
        if (newBoolean == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}


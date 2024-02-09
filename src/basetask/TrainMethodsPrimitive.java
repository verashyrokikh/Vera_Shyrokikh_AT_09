package basetask;

public class TrainMethodsPrimitive {
    int isInt =9;
    long isLong = 23523;
    char isChar= '$';
    float isFloat= 234.2F;
    double isDouble=25.25;
    short isShort=2;
    byte isByte=1;
    boolean isBoolean=true;

    public void printInt() {
        System.out.println("Я получил на вход число " + isInt);
    }
    public void printLong() {
        System.out.println("Я получил на вход длинное число " + isLong);
    }
    public void printChar() {
        System.out.println("Я получил на вход символ " + isChar );
    }
    public void printFloat() {
        System.out.println("Я получил на вход дробное число " + isFloat);
    }
    public void printDouble() {
        System.out.println("Я получил на вход длинное дробное число " + isDouble);
    }
    public void printShort() {
        System.out.println("Я получил на вход короткое число " + isShort);
    }
    public void printByte(){
        System.out.println("Я получил на вход очень короткое число " +isByte);
    }
    public void printBoolean() {
        System.out.println("Я получил на вход булево "+ isBoolean);
    }
}


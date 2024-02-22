package homework.day6.generics;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X someArgs) {
        System.out.printf("I received 1 argument of type: %s class.\n ", someArgs.getClass().getSimpleName());
        return "I received 1 argument of type: " + someArgs.getClass().getSimpleName() + " class.";
    }

    public String genericMethodGenArgs(X someArgs, Y someArgs2) {
        System.out.printf("I received 2 arguments of type: %s class, %s class.\n", someArgs.getClass().getSimpleName(), someArgs2.getClass().getSimpleName());
        return "I received 2 arguments of type: " + someArgs.getClass().getSimpleName() + " class, " + someArgs2.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X someArgs3) {
        System.out.printf("I got an object of %s class.\n", someArgs3.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(X someArgs4, String string) {
        System.out.printf("I got an object of %s class and string with %s characters.\n", someArgs4.getClass().getSimpleName(), string.length());
    }

    public void genericMethodHalfGenArgs(X someArgs4, Y someArgs5, String string) {
        System.out.printf("I got an object of %s class and %s class and string with %s characters.\n", someArgs4.getClass().getSimpleName(), someArgs5.getClass().getSimpleName(), string.length());
    }
}

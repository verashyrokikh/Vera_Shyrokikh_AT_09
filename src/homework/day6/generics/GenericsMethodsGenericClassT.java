package homework.day6.generics;

public class GenericsMethodsGenericClassT<T> {

    public <T> void genericMethodOneGenArg(T namesT) {
        System.out.printf("I am an object of %s class.\n", namesT.getClass().getSimpleName());
    }

    public <A, C> String genericMethodTwoGenArgs(A namesA, C namesC) {
        System.out.printf("We are objects of %s class and %s class.\n", namesA.getClass().getSimpleName(), namesC.getClass().getSimpleName());
        return "We are objects of %s class and %s class.\n"+ namesA.getClass().getSimpleName() + namesC.getClass().getSimpleName();
    }

    public <D> void genericMethodHalfGenArgs(D namesD, String counter) {
        System.out.printf("I got an object of %s class and string with %s characters.\n", namesD.getClass().getSimpleName(), counter.length());
    }
}

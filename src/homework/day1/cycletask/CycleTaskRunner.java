
package homework.day1.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        WhileMethod whileMethod = new WhileMethod();
        whileMethod.whileMethod();

        ForMethod forCycle = new ForMethod();
        forCycle.forCycleMethod();

        RandomIntoArray randomIntoArray = new RandomIntoArray();
        randomIntoArray.randomArray();

        //PrintArrayMethod printArrayMethod = new PrintArrayMethod();
       // printArrayMethod.printArray(new int[]{3, 4, 5, 6, 72, 5, 5, 7, 1});

        ArrayMath arrayMath = new ArrayMath();
        arrayMath.arrayMath();

        ArraySorting arraySorting = new ArraySorting();
        arraySorting.changeArrayValues();
        arraySorting.findMin();
       //arraySorting.reverseSorting();
    }
}
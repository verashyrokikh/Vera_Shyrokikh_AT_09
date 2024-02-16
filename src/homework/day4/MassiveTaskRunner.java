package homework.day4;

public class MassiveTaskRunner {
    public static void main(String[] args) {
        MassiveTask massiveTask = new MassiveTask();
        massiveTask.massiveCount(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3);
        massiveTask.printCow();
    }

}

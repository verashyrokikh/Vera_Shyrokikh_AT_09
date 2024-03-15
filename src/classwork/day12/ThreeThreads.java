package classwork.day12;

import static classwork.day12.ThreadsTraining.heavyMethod;

public class ThreeThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> heavyMethod());
        Thread t2 = new Thread(() -> heavyMethod());
        Thread t3 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            heavyMethod();
        });
        t1.start();
        t2.start();
        t3.start();

    }
}
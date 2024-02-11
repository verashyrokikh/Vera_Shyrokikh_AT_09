package homework.day1.basetask;

public class ObjectsRunner {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Minnie", 6);
        mouse.printMouseDetails();

        Bee bee = new Bee("female",  0.00025);
        bee.printBeeDetails();

        Obstacle obstacle = new Obstacle("a tree on the road", "significant");
        obstacle.printObstacleDetails();

        Pineapple pineapple = new Pineapple("Cubinian", 2200.0);
        pineapple.printPineappleDetails();

        Souce souce = new Souce("Barbeque", "brown");
        souce.printSouceDetails();
    }
}

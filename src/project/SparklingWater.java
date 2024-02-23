//наследуется от Water
//содеждит приватные поля boolean isOpened, Bubble[] bubbles
//содержит конструктор SparklingWater(), который вызывает внутренний метод isOpened();
//есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
//есть публичный метод void setOpened(), который меняет состояние воды на "открытое" и запускает метод degas()
//есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды (для засыпания на секунду используем Thread.sleep(1000);)
//
//есть приватный метод void isOpened(), который пока ничего не делает

package project;

public class SparklingWater extends Water {
    private static boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature, boolean isOpened) {
        super(color, transparency, smell, temperature);
        this.isOpened = isOpened;
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        for (int i = 0; i < bubbles.length; i++) {
          //  bubbles[i] = new Bubble;
        }
        this.bubbles = bubbles;
    }


    public void setOpened() {
        SparklingWater.isOpened = true;
        //каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
       // private void degas() {

      //  }
    }

    private void isOpened(){};

}

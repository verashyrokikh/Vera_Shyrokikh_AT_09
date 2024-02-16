//содеждит приватные поля String color = "no", String transparency = "transparent", String smell = "no", int temperature = 0
//содеждит конструктор, геттеры и сеттеры ко всем полям

package project;

public class Water {
    private String color ="no";
    private String transparency ="transparent";
    private String smell = "no";
    int temperature;

    public Water(String color, String transparency, String smell, int temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setOpened() {
    }
}

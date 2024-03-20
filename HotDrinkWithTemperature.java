public class HotDrinkWithTemperature extends HotDrink { // Расширение класса "ГорячихНапитков"
    private int temperature;

    public HotDrinkWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    // Геттер и сеттер для температуры

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}



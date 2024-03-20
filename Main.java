public class Main {
    public static void main(String[] args) { 
        HotDrinkMachine machine = new HotDrinkMachine(); // Инициализация ГорячиеНапиткиАвтомат
        HotDrink tea = machine.getProduct("Черный чай", 200); // Инициализация нескольких напитков
        HotDrink tea1 = machine.getProduct("Зелёный чай", 250);
        HotDrink tea2 = machine.getProduct("Фруктовый чай", 150);
        HotDrinkWithTemperature hotCoffee = machine.getProduct("Эспрессо", 100, 70);

        System.out.println("Напиток: " + tea.getName() + ", объём: " + tea.getVolume() + " мл");
        System.out.println("Напиток: " + tea1.getName() + ", объём: " + tea.getVolume() + " мл");
        System.out.println("Напиток: " + tea2.getName() + ", объём: " + tea.getVolume() + " мл");
        System.out.println("Напиток: " + hotCoffee.getName() + ", объём: " + hotCoffee.getVolume() + " температура: " + hotCoffee.getTemperature());
    }
}
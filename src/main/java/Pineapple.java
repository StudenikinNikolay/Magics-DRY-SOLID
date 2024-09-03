public class Pineapple extends Product implements Food {
    //Open Closed Principle - имплементируя интерфейс Food мы добавляем
    // классу функциональности, не изменяя его код
    private final String name = "Ананас";
    private final int price = 4900;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Ананасы съедены");
    }
}
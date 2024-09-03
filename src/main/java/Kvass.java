public class Kvass extends Product implements Food {
    //Single Responsibility Principle - класс Kvass описывает только квас, а не все продукты
    private final String name = "Квас";
    private final int price = 70;

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
        System.out.println("Квас выпит");
    }
}
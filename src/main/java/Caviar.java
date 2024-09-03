public class Caviar extends Product implements Food {
    private final String name = "Черная икра";
    private final int price = 17000;

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
        System.out.println("Черная икра съедена");
    }
}
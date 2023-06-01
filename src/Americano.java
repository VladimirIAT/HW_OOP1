public class Americano extends HotDrink{
    public Americano(String kind, int price, int temperature, long id) {
        super(kind, price, temperature, id);
    }

    @Override
    public String toString() {
        return String.format("У американо: %s, %s, %s, %s", getName(), getPrice(), getTemperature(), getId());
    }
}

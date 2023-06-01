public class Capuchino extends HotDrink {
    public Capuchino(String kind, int price, int temperature, long id) {
        super(kind, price, temperature, id);
    }

    @Override
    public String toString() {
        return String.format("У капучино: %s, %s, %s, %s", getName(), getPrice(), getTemperature(), getId());
    }
}

public abstract class HotDrink {
    String kind;
    private int price;
    private long id;
    private int temperature;

    public  HotDrink(String kind, int price, int temperature, long id) {
        this.kind = kind;
        this.price = price;
        this.temperature = temperature;
        this.id = id;
    }

    public String getName() {
        return kind;
    }
    public void setName(String name) {
        this.kind = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

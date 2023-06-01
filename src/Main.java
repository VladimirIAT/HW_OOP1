//1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getHotDrink(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
//4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

public class Main {
    public static void main(String[] args) {
        VendingHotDrink VendingHotDrink = new VendingHotDrink();
        HotDrink HotDrink1 = new Latte("Latte", 20, 80, 1l);
        HotDrink HotDrink2 = new Capuchino("Capuchino", 30, 85,2l);
        HotDrink HotDrink3 = new Americano("Strong Americfno", 25, 90, 3l);

        VendingHotDrink.addHotDrink(HotDrink1);
        VendingHotDrink.addHotDrink(HotDrink2);
        VendingHotDrink.addHotDrink(HotDrink3);

        System.out.println(VendingHotDrink.getHotDrink("Latte"));
        System.out.println(VendingHotDrink.getHotDrink(2L));
        System.out.println(VendingHotDrink.getHotDrink(3L));
        System.out.println(VendingHotDrink.getHotDrink(1L));
    }
}
import java.util.ArrayList;
import java.util.List;

public class VendingHotDrink {
    private final List<HotDrink> list;
    public VendingHotDrink() {
        list = new ArrayList<>();
    }
    void addHotDrink(HotDrink HotDrink) {
        list.add(HotDrink);
    }
    HotDrink getHotDrink(String kind) {
        for (HotDrink HotDrink : list) {
            if (kind.equals(HotDrink.getName())) {
                return  HotDrink;
            }
        }
        return null;
    }

    HotDrink getHotDrink(Long id) {
        for (HotDrink HotDrink : list) {
            if (id.equals((HotDrink.getId()))) {
                return HotDrink;
            }
        }
        return null;
    }
}

package problem;

import java.util.ArrayList;
import java.util.List;


public class Catalog  {
    private final List<Item> items;
    private final String name;

    public Catalog(String catalogName) {
        this.name = catalogName;
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return this.items;
    }

    @Override
    public String toString(){
        return items.toString();
    }
}

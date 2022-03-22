package compulsory;

import java.util.ArrayList;
import java.util.List;


public class Catalog implements ICatalogCommands {

    List<Item> items;

    public Catalog(ArrayList<Item> allItems){
        items = allItems;
    }

    public Catalog(){
        items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    @Override
    public String toString(){
        return items.toString();
    }
}

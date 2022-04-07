package commands;

import commands.abstracts.Command;
import problem.*;

import java.util.ArrayList;
import java.util.List;

public class AddCommand extends Command {

    Item[] itemList;
    Catalog catalog;

    public AddCommand(Catalog catalog, Item... items){
        itemList = items;
        this.catalog = catalog;
    }

    public void execute() {
        for(Item item : itemList){
            catalog.getItems().add(item);
        }
    }
}

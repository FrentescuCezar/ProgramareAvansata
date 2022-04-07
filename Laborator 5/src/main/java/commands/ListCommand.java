package commands;

import commands.abstracts.Command;
import problem.*;

public class ListCommand extends Command {

    Catalog catalog;

    public ListCommand(Catalog catalog) {
        super(catalog);
        this.catalog = catalog;
    }

    @Override
    public void execute() {
        if (catalog == null) {
            System.out.println("Catalog is empty");
            return;
        }
        System.out.println(catalog);
    }


}

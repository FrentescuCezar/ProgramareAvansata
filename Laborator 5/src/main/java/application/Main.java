package application;

import commands.abstracts.Command;

import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;
import problem.Item;
import commands.*;
import problem.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Item item1 = new Item("fncbrasov", "Being Youself ", "https://www.facebook.com/frentescu.cezar/", 2001, "Frentescu Cezar-Augustin", TypeOfItem.BOOK);
        Item item2 = new Item("dQw4w9WgXcQ", "Why is clickbait so effective?", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", 1987, "Rick Astley", TypeOfItem.REVIEW);
        Catalog catalog = new Catalog("Primul catalog de iteme");

        String path = "E:\\NEW FRESH\\Facultate\\Anul 2\\Semestrul 2\\4.Programare Avansata\\ProgramareAvansata\\Laborator 5\\src\\main\\Json\\";

        List<Command> allCommands = new ArrayList<>();
        Command addCommand = new AddCommand(catalog,item1,item2);
        Command saveCommand = new SaveCommand(catalog, path + "savedJson.json");
        Command listCommand = new ListCommand(catalog);
        Command loadCommand = new LoadCommand(path + "\\savedJson.json");
        Command viewCommand = new ViewCommand(path,"savedJson.json");
        Command reportCommand = new ReportCommand(item1);
        Command infoCommand = new InfoCommand();

        allCommands.add(addCommand);
        allCommands.add(saveCommand);
        allCommands.add(listCommand);
        allCommands.add(viewCommand);
        allCommands.add(reportCommand);

        infoCommand.execute();

        for(Command command : allCommands){
            //command.execute();
        }
    }
}

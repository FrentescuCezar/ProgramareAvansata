package commands;

import commands.abstracts.Command;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ViewCommand extends Command {

    String item;

    public ViewCommand(String path, String item) {
        super(path);
        this.item = item;
    }

    public void execute() throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File(super.path + item));
    }
}

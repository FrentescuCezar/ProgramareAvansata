package commands;

import commands.abstracts.Command;
import problem.Catalog;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class SaveCommand extends Command {

    public SaveCommand(Catalog catalog, String path) {
        super(catalog, path);
    }

    public void execute() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(super.path), super.catalog);
        } catch (IOException err) {
            throw new IOException(err);
        }
    }

}

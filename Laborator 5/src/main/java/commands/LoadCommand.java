package commands;

import commands.abstracts.Command;
import problem.Catalog;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class LoadCommand extends Command {

    public LoadCommand(String path) {
        super(path);
    }

    public void execute() throws IOException{
        load();
    }

    public Catalog load() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(path), Catalog.class);
    }

}

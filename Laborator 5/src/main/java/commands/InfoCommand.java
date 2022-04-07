package commands;

import commands.abstracts.Command;

import org.apache.tika.exception.*;
import org.apache.tika.metadata.*;
import org.apache.tika.parser.*;


import org.apache.tika.parser.asm.ClassParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class InfoCommand extends Command {

    public InfoCommand() {
    }

    public void execute() throws IOException, TikaException, SAXException {
        //detecting the file type
        BodyContentHandler handler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        FileInputStream inputstream = new FileInputStream(new File("E:\\NEW FRESH\\Facultate\\Anul 2\\Semestrul 2\\4.Programare Avansata\\ProgramareAvansata\\Laborator 5\\target\\classes\\problem\\Catalog.class"));
        ParseContext pcontext = new ParseContext();

        //Html parser
        ClassParser ClassParser = new  ClassParser();
        ClassParser.parse(inputstream, handler, metadata,pcontext);
        System.out.println("Contents of the document:" + handler.toString());
        System.out.println("Metadata of the document:");
        String[] metadataNames = metadata.names();

        for(String name : metadataNames) {
            System.out.println(name + " :  " + metadata.get(name));
        }
    }
}

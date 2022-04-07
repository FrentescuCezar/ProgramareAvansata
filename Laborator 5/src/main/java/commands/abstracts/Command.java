package commands.abstracts;

import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;
import problem.Item;
import problem.Catalog;

import java.io.IOException;

public abstract class Command {
    protected Item item;
    protected Catalog catalog;
    protected String path;

    public Command(Item item, Catalog catalog, String path) {
        this.item = item;
        this.catalog = catalog;
        this.path = path;
    }
    public Command(Item item, Catalog catalog) {
        this.item = item;
        this.catalog = catalog;
    }
    public Command(Item item, String path) {
        this.item = item;
        this.path = path;
    }
    public Command(Catalog catalog, String path) {
        this.catalog = catalog;
        this.path = path;
    }
    public Command(Item item) {
        this.item = item;
    }
    public Command(Catalog catalog) {
        this.catalog = catalog;
    }
    public Command(String path) {
        this.path = path;
    }

    public Command(){

    }

    public void setItem(Item item) {
        this.item = item;
    }
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public Item getItem() {
        return item;
    }
    public Catalog getCatalog() {
        return catalog;
    }
    public String getPath() {
        return path;
    }

    public abstract void execute() throws Exception;

}

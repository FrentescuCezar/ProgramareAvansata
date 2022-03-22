import compulsory.*;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Item> allItems = new ArrayList<>();

        Catalog catalog = new Catalog();

        Item item1 = new Item("knuth67", "The Art of Computer Programming",
                "d:/books/programming/tacp.ps", 1965, "Donald E. Knuth", TypeOfItem.BOOK);

        Item item2 = new Item("java17", "The Java Language Specification",
                "https://docs.oracle.com/javase/specs/jls/se17/html/index.html", 2021, "James Gosling & others");

        catalog.add(item1);
        catalog.add(item2);

        System.out.println(catalog);

        CatalogUtil.save(catalog,"E:\\JSON"); // INCA NU MERGE SA SALVEZ (Access is denied)
    }
}

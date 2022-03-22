package compulsory;

public class Item {
    private String id;
    private String title;
    private String location;
    private int year;
    private String author;
    private TypeOfItem type;

    public Item(String id, String title, String location, int year, String author, TypeOfItem type) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.year = year;
        this.author = author;
        this.type = type;
    }

    public Item(String id, String title, String location, int year, String author) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.year = year;
        this.author = author;
        this.type = TypeOfItem.BOOK; // DEFAULT BOOK TYPE
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", type=" + type +
                "}\n";
    }
}

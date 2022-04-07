package problem;

import java.io.File;

public class Item {
    private final String id , title , location, author;
    private final int year;
    private TypeOfItem type = TypeOfItem.BOOK; // Default Book

    public File file;

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
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public TypeOfItem getType() {
        return type;
    }

    public void setType(TypeOfItem type) {
        this.type = type;
    }

    public void setFile(File file) {
        this.file = file;
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

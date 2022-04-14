import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return  false;
        Book book = (Book) o;
        return  Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(title, author);
    }

    public String toString() {
        return author + " " + title;
    }
}




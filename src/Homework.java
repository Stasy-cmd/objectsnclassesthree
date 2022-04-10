import java.awt.print.Book;

public class Homework {
    public static void main(String[] args) {
        Author author = new Author("Дима", "Маслеников");
        Book book = new Book("Book 1 ", author, 2026);
        System.out.println(book.getTitle() + " " + book.getAuthor().getFirstName() + " "
                + book.getAuthor().getLastName() + " " + book.getYear());

        book.setYear(2015)

        System.out.println(book.getTitle() + " " + book.getAuthor().getFirstName() + " "
                + book.getAuthor().getLastName() + " " + book.getYear());
    }
}

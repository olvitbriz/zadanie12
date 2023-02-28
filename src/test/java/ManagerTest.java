import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Book;
import ru.netology.Manager;
import ru.netology.Product;
import ru.netology.Repository;

public class ManagerTest {
    @Test
    public void searchTest() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(11, "Martin Eden", 100, "London");
        Book book2 = new Book(12, "The count of Monte Cristo", 200, "Dumas");
        Book book3 = new Book(13, "Robinzon Cruzoe", 300, "Defo");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Product[] actual = manager.searchBy("London");
        Product[] expected = {book1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTest() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(11, "Martin Eden", 100, "London");
        Book book2 = new Book(12, "The count of Monte Cristo", 200, "Dumas");
        Book book3 = new Book(13, "Robinzon Cruzoe", 300, "Defo");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2,book3};
        Assertions.assertArrayEquals(expected, actual);
    }
}

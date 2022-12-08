import java.util.Objects;

public class Book {
    private static String title;
    private static int year;
    public String authorName;
    private Book id;

    public Book (String title, int year, String authorName) {
        this.title = title;
        this.year = year;
        this.authorName = authorName;
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название книги: " + this.title + ". Год публикации книги: " + this.year + ". Автор книги: " + this.authorName;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, Book.title) && Objects.equals(year, Book.year);
    }


}
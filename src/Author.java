import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    private Author id;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return this.name;

    }

    public String getSurname() {
        return this.surname;

    }
    @Override
    public String toString() {
        return "Имя автора: " + this.name + ". Фамилия автора: " + this.surname;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }


}
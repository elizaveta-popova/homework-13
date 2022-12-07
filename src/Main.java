public class Main {
    public static void main(String[] args) {
        Book FightClub = new Book("FightClub", 1996, "Chuck Palahniuk");
        System.out.println(FightClub);
        FightClub.setYear(1999);
        System.out.println("Новый год публикации книги: " + FightClub.getYear());

        Author ChuckPalahniuk = new Author ("Chuck", "Palahniuk");
        System.out.println(ChuckPalahniuk);

        System.out.println("-------------------");

        Book ForrestGump = new Book("Forrest Gump", 1986, "Winston Groom");
        System.out.println(ForrestGump);

        Author WinstonGroom = new Author ("Winston", "Groom");
        System.out.println(WinstonGroom);

        if (FightClub.equals(ForrestGump)) {
            System.out.println("Книги разные.");
        } else {
            System.out.println("Книги одинаковые.");
        }

        if (ChuckPalahniuk.equals(WinstonGroom)) {
            System.out.println("Авторы разные.");
        } else {
            System.out.println("Авторы одинаковые.");
        }

    }
}
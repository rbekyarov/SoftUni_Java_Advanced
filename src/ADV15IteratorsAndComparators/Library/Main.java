package ADV15IteratorsAndComparators.Library;

public class Main {
    public static void main(String[] args) {

        Books books1 = new Books("Book1OOO");
        Books books2 = new Books("BookUU2");
        Books books3 = new Books("Book3YY");

        Library<Books> library = new Library<>();
        Library<Books> library2 = new Library<>(books1);
        Library<Books> library3 = new Library<>(books1, books2, books3);

        for (Books books : library3) {
            System.out.println(books.getTitle());
        }

    }
}

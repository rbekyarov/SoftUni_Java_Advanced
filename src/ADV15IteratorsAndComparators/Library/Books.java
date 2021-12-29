package ADV15IteratorsAndComparators.Library;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private String title;
    private int year;
    private List<String> authors;

    public Books(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>();
        for (String author : authors) {
            this.authors.add(author);

        }

    }

    public Books(String title) {
        this.title = title;
    }


    public String getTitle() {
        return this.title;
    }
}

package org.chelobyte.library.data.bookdata;

import org.chelobyte.library.misc.Genre;

import java.util.List;
import java.util.Random;

public class Book {

    private static final Random random = new Random();

    private final BookStorage bookStorage;
    private final String name;
    private final String authorFirstName;
    private final String authorLastName;
    private final int year;
    private final List<Genre> genres;
    private boolean isAvailable;

    protected Book(
            BookStorage bookStorage,
            String name,
            String authorFirstName,
            String authorLastName,
            int year,
            List<Genre> genres,
            boolean isAvailable
    ) {
        this.bookStorage = bookStorage;
        this.name = name;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.year = year;
        this.genres = List.copyOf(genres);
        this.isAvailable = isAvailable;
    }

    public void changeAvailability() {
        this.isAvailable = !getIsAvailable();
    }

    public String getName() {
        return name;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public int getYear() {
        return year;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

}

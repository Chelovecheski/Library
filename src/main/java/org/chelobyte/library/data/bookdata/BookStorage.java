package org.chelobyte.library.data.bookdata;

import org.chelobyte.library.data.Storage;
import org.chelobyte.library.misc.Genre;

import java.util.ArrayList;
import java.util.List;

public class BookStorage extends Storage {

    private List<Book> books = new ArrayList<>();

    public void addBook(String name, String authorFirstName, String authorLastName,
                        int year, List<Genre> genres, boolean isAvailable) {
        Book book = new Book(this, name, authorFirstName, authorLastName, year,
                List.copyOf(genres), isAvailable);

        addBook(book);

    }

    private void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getList() {
        return books;
    }
}

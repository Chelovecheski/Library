package org.chelobyte.library.data;

import org.chelobyte.library.data.bookdata.Book;
import org.chelobyte.library.data.bookdata.BookStorage;
import org.chelobyte.library.misc.Genre;

import java.util.NoSuchElementException;

public class BookFinder {

    public static Book findBook(BookStorage bookStorage, String input) {

        if (findBookByName(bookStorage, input) != null) {
            return findBookByName(bookStorage, input);
        } else if (findBookByAuthorFirstName(bookStorage, input) != null) {
            return findBookByAuthorFirstName(bookStorage, input);
        } else if (findBookByAuthorLastName(bookStorage, input) != null) {
            return findBookByAuthorLastName(bookStorage, input);
        } else if (findBookByGenre(bookStorage, input) != null) {
            return findBookByGenre(bookStorage, input);
        } else if (findBookByYear(bookStorage, input) != null) {
            return findBookByYear(bookStorage, input);
        }

        throw new NoSuchElementException();

    }

    private static Book findBookByName(BookStorage bookStorage, String input) {

        for (Book book : bookStorage.getList()) {
            if (book.getName().equals(input)) {
                return book;
            }
        }

        return null;

    }

    private static Book findBookByAuthorFirstName(BookStorage bookStorage, String input) {

        for (Book book : bookStorage.getList()) {
            if (book.getAuthorFirstName().equals(input)) {
                return book;
            }
        }

        return null;

    }

    private static Book findBookByAuthorLastName(BookStorage bookStorage, String input) {

        for (Book book : bookStorage.getList()) {
            if (book.getAuthorLastName().equals(input)) {
                return book;
            }
        }

        return null;

    }

    private static Book findBookByYear(BookStorage bookStorage, String input) {

        for (Book book : bookStorage.getList()) {
            if (book.getYear() == Integer.parseInt(input)) {
                return book;
            }
        }

        return null;

    }

    private static Book findBookByGenre(BookStorage bookStorage, String input) {

        for (Book book : bookStorage.getList()) {
            for (Genre genre : book.getGenres()) {
                if (genre.getName().equals(input)) {
                    return book;
                }
            }
        }

        return null;

    }

}

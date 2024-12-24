package org.chelobyte.library.librarydata;

import org.chelobyte.library.data.bookdata.BookStorage;
import org.chelobyte.library.misc.Genre;
import org.chelobyte.library.data.BookFinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class FindBookTest {

    private BookStorage bookStorage;

    @BeforeEach
    void setUp() {

        bookStorage = new BookStorage();
        bookStorage.addBook("1984", "George", "Orwell", 1949,
                List.of(Genre.DYSTOPIA, Genre.ROMANCE), true);

    }

    @Test
    void findBookByName() {

        // given
        // when
        // then
        assertThat(BookFinder.findBook(bookStorage, "1984"), not(equalTo(null)));

    }

    @Test
    void findBookByAuthorFirstName() {

        // given
        // when
        // then
        assertThat(BookFinder.findBook(bookStorage, "George"), not(equalTo(null)));

    }

    @Test
    void findBookByAuthorLastName() {

        // given
        // when
        // then
        assertThat(BookFinder.findBook(bookStorage, "Orwell"), not(equalTo(null)));

    }

    @Test
    void findBookByYear() {

        // given
        // when
        // then
        assertThat(BookFinder.findBook(bookStorage, "1949"), not(equalTo(null)));

    }

    @Test
    void findBookByGenre() {

        // given
        // when
        // then
        assertThat(BookFinder.findBook(bookStorage, "Romance"), not(equalTo(null)));

    }
}
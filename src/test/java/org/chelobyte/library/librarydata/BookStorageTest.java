package org.chelobyte.library.librarydata;

import org.chelobyte.library.data.bookdata.BookStorage;
import org.chelobyte.library.misc.Genre;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BookStorageTest {

    @Test
    void checkIfBooksAddingToBookStorageList() {

        // given
        BookStorage bookStorage = new BookStorage();

        bookStorage.addBook("1984", "George", "Orwell", 1949,
                List.of(Genre.DYSTOPIA), false);

        // when
        // then
        assertThat(bookStorage.getList().size(), is(1));

    }

}
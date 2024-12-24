package org.chelobyte.library;

import org.chelobyte.library.config.LibraryConfig;
import org.chelobyte.library.data.bookdata.BookStorage;
import org.chelobyte.library.data.userdata.AccountStorage;
import org.chelobyte.library.misc.Genre;
import org.chelobyte.library.misc.Printer;
import org.chelobyte.library.misc.choice.AccountChoice;
import org.chelobyte.library.misc.choice.BookChoice;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Executor {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LibraryConfig.class);

        BookStorage bookStorage = context.getBean("bookStorage", BookStorage.class);
        AccountStorage accountStorage = context.getBean("accountStorage", AccountStorage.class);
        AccountChoice accountChoice = context.getBean("accountChoice", AccountChoice.class);
        BookChoice bookChoice = context.getBean("bookChoice", BookChoice.class);

        accountStorage.createAccount("Jeremy", "Chelovecheski", "account");

        bookStorage.addBook("1984", "George", "Orwell", 1949,
                List.of(Genre.DYSTOPIA, Genre.ROMANCE), false);
        bookStorage.addBook("451 Fahrenheit", "Ray", "Bradbury", 1953,
                List.of(Genre.DYSTOPIA, Genre.THRILLER), true);
        bookStorage.addBook("Metro 2033", "Dmitry", "Glukhovsky", 2007,
                List.of(Genre.HORROR, Genre.SCIENCE_FICTION), true);
        bookStorage.addBook("Harry Potter", "Joanne", "Rowling", 1977,
                List.of(Genre.COMEDY, Genre.FICTION), false);
        bookStorage.addBook("The Witcher", "Andrzej", "Sapkowski", 1986,
                List.of(Genre.FICTION, Genre.COMEDY), true);

        Printer.printGreetings();
        Printer.printLine();
        accountChoice.choose();

        while (true) {
            bookChoice.choose();
        }

    }

}

package org.chelobyte.library.misc.choice;

import org.chelobyte.library.data.BookFinder;
import org.chelobyte.library.data.bookdata.Book;
import org.chelobyte.library.data.bookdata.BookStorage;
import org.chelobyte.library.misc.Input;
import org.chelobyte.library.misc.Printer;

import java.util.NoSuchElementException;
import java.util.Properties;

public class BookChoice extends Choice {

    private final BookStorage bookStorage;

    public BookChoice(BookStorage bookStorage) {
        this.bookStorage = bookStorage;
    }

    @Override
    public void choose() {

        Printer.printChooseBookOption();
        Printer.printLine();

        while (true) {
            try {
                byte input = Byte.parseByte(Input.input());

                switch (input) {
                    case 1 -> findBook();
                    case 2 -> takeBook();
                    case 3 -> returnBook();
                    default -> throw new NoSuchElementException();
                }
            } catch (Exception e) {
                Printer.printNoSuchElementException();
                choose();
            }
            break;
        }

    }

    private void findBook() {

        while (true) {
            try {
                Printer.printFindBookRequest();
                String input = Input.input();

                Book book = BookFinder.findBook(bookStorage, input);

                Printer.printBookInfo(book);
                Printer.printLine();
            } catch (NoSuchElementException e) {
                Printer.printLine();
                Printer.printNoSuchBookException();
                Printer.printLine();
                findBook();
            }
            break;
        }

    }

    private void takeBook() {

        while (true) {
            try {
                Printer.printTakeReturnBookRequest();
                String input= Input.input();

                Book book = BookFinder.findBook(bookStorage, input);
                if (!book.getIsAvailable()) {
                    throw new NoSuchElementException();
                }

                book.changeAvailability();

                Printer.printBookHasBennTaken();
                Printer.printLine();
            } catch (NoSuchElementException e) {
                Printer.printLine();
                Printer.printNoSuchBookException();
                Printer.printLine();
                takeBook();
            }
            break;
        }

    }

    private void returnBook() {

        while (true) {
            try {
                Printer.printTakeReturnBookRequest();
                String input = Input.input();

                Book book = BookFinder.findBook(bookStorage, input);
                if (book.getIsAvailable()) {
                    throw new NoSuchElementException();
                }

                book.changeAvailability();
                Printer.printBookHasBeenReturned();
                Printer.printLine();
            } catch (NoSuchElementException e) {
                Printer.printLine();
                Printer.printNoSuchBookException();
                Printer.printLine();
                returnBook();
            }
            break;
        }

    }

}

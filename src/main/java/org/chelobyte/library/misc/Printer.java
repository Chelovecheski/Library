package org.chelobyte.library.misc;

import org.chelobyte.library.data.bookdata.Book;

public class Printer {

    public static void printLine() {
        System.out.println("--------------------------------\n");
    }

    public static void printNoSuchElementException() {
        System.out.println("\nSorry, but there is not such of option. Try again.\n");
    }

    public static void printNoSuchBookException() {
        System.out.println("Sorry, book hasn't found. Try again.");
    }

    public static void printWrongPasswordException() {
        System.out.println("Sorry, but password is wrong. Try again.\n");
    }

    public static void printWrongUsernameException() {
        System.out.println("Sorry, but user with such username does not exists. Try again.\n");
    }

    public static void printGreetings() {
        System.out.println("Hello! Welcome to the library!\n");
    }

    public static void printAccountChoice() {
        System.out.println("Choose one of the following options:\n" +
                "1. Register a new account.\n"  +
                "2. Log in to account.\n");
    }

    public static void printTypeName() {
        System.out.println("\nType your name:");
    }

    public static void printComeUpWithUsername() {
        System.out.println("\nCome up with a username:");
    }

    public static void printUsernameException() {
        System.out.println("Sorry, user with this username already exists. " +
                "Please, come up with something else:\n");
    }

    public static void printComeUpWithPassword() {
        System.out.println("\nCome up with a password:");
    }

    public static void printAccountSuccessfullyCreated() {
        System.out.println("\nAccount has been successfully created!\n");
    }

    public static void printTypeUsername() {
        System.out.println("\nType your username:");
    }

    public static void printTypePassword() {
        System.out.println("\nType your password:");
    }

    public static void printChooseBookOption() {
        System.out.println("Choose one of the following option:\n" +
                "1. Find a book.\n" +
                "2. Take a book.\n" +
                "3. Return a book\n");
    }

    public static void printFindBookRequest() {
        System.out.println("\nType something, you know about the book:");
    }

    public static void printBookInfo(Book book) {
        System.out.printf("\nBook info:\n" +
                "Name: %s.\n" +
                "Author name: %s %s.\n" +
                "Year of writing: %s.\n" +
                "Is Available?: %s.\n",
                book.getName(),
                book.getAuthorFirstName(), book.getAuthorLastName(),
                Integer.toString(book.getYear()), isAvailableToString(book));
    }

    private static String isAvailableToString(Book book) {

        if (book.getIsAvailable()) {
            return "Yes";
        } else {
            return "No";
        }

    }

    public static void printTakeReturnBookRequest() {
        System.out.println("\nType info about the book:");
    }

    public static void printBookHasBennTaken() {
        System.out.println("\nThe book has been successfully taken.\n");
    }

    public static void printBookHasBeenReturned() {
        System.out.println("\nThe book has been successfully returned.\n");
    }

}

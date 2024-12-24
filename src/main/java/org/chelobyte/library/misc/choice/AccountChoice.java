package org.chelobyte.library.misc.choice;

import org.chelobyte.library.data.userdata.AccountStorage;
import org.chelobyte.library.misc.Input;
import org.chelobyte.library.misc.Printer;

import java.util.NoSuchElementException;

public class AccountChoice extends Choice {

    private final AccountStorage accountStorage;

    public AccountChoice(AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }

    @Override
    public void choose() {
        Printer.printAccountChoice();
        Printer.printLine();

        while (true) {
            try {
                byte input = Byte.parseByte(Input.input());

                switch (input) {
                    case 1 -> register();
                    case 2 -> logIn();
                    default -> throw new NoSuchElementException();
                }
            } catch (Exception e) {
                Printer.printLine();
                Printer.printNoSuchElementException();
                Printer.printLine();
                choose();
            }
        break;
        }

    }

    private void register() {

        while (true) {
            try {
                Printer.printTypeName();
                String name = Input.input();
                Printer.printComeUpWithUsername();
                String username = Input.input();
                Printer.printComeUpWithPassword();
                String password = Input.input();

                accountStorage.createAccount(name, username, password);

                Printer.printAccountSuccessfullyCreated();
                Printer.printLine();
            } catch (ArrayStoreException e) {
                Printer.printLine();
                Printer.printUsernameException();
                Printer.printLine();
                register();
            }
            break;
        }


    }

    private void logIn() {

        while (true) {
            try {
                Printer.printTypeUsername();
                String username = Input.input();
                Printer.printTypePassword();
                String password = Input.input();

                accountStorage.logIn(username, password);

                Printer.printLine();
            } catch (IllegalArgumentException e) {
                Printer.printLine();
                Printer.printWrongPasswordException();
                Printer.printLine();
                logIn();
            } catch (IllegalStateException e) {
                Printer.printLine();
                Printer.printWrongUsernameException();
                Printer.printLine();
                logIn();
            }
            break;
        }

    }

}

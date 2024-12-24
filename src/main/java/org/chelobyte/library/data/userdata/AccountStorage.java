package org.chelobyte.library.data.userdata;

import org.chelobyte.library.data.Storage;

import java.util.ArrayList;
import java.util.List;

public class AccountStorage extends Storage {

    private List<Account> accounts = new ArrayList<>();

    public void createAccount(String name, String username, String password) {

            Account account = new Account(this, name, username, password);
            addAccount(account);

    }

    public Account logIn(String username, String password) {

        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                if (account.getPassword().equals(password)) {
                    return account;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }

        throw new IllegalStateException();

    }

    private void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public List<Account> getList() {
        return accounts;
    }

}

package org.chelobyte.library.data.userdata;

public class Account {

    private final AccountStorage accountStorage;
    private final String name;
    private final String username;
    private String password;

    protected Account(AccountStorage accountStorage, String name,
                      String username, String password) {
        this.accountStorage = accountStorage;
        this.name = name;
        this.username = checkUsername(username);
        this.password = password;
    }

    public String checkUsername(String input) {

        if (accountStorage.getList().isEmpty()) {
            return input;
        }

        for (Account account : accountStorage.getList()) {
            if (account.getUsername().equals(input)) {
                throw new ArrayStoreException();
            }
        }

        return input;

    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

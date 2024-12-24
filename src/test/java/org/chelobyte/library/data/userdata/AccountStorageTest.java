package org.chelobyte.library.data.userdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class AccountStorageTest {

    AccountStorage accountStorage;

    @BeforeEach
    void setUp() {
        accountStorage = new AccountStorage();
    }

    @Test
    void createAccountWithSameUsernameShouldThrowArrayStoreException() throws ArrayStoreException {

        // given
        AccountStorage accountStorage = new AccountStorage();
        accountStorage.createAccount("Victor", "victor13", "123");

        // when
        // then
        assertThrows(ArrayStoreException.class, () -> accountStorage.createAccount("Alex", "victor13", "456"));

    }

    @Test
    void createAccountAndAddToAccountStorage() {

        // given
        // when
        accountStorage.createAccount("Victor", "victor13", "123");

        // then
        assertThat(accountStorage.getList().size(), is(1));

    }

}
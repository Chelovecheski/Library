package org.chelobyte.library.config;

import org.chelobyte.library.data.bookdata.BookStorage;
import org.chelobyte.library.data.userdata.AccountStorage;
import org.chelobyte.library.misc.choice.AccountChoice;
import org.chelobyte.library.misc.choice.BookChoice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LibraryConfig {

    @Bean
    @Scope("singleton")
    protected BookStorage bookStorage() {
        return new BookStorage();
    }

    @Bean
    @Scope("singleton")
    protected AccountStorage accountStorage() {
        return new AccountStorage();
    }

    @Bean
    @Scope("singleton")
    protected AccountChoice accountChoice() {
        return new AccountChoice((AccountStorage) accountStorage());
    }

    @Bean
    @Scope("singleton")
    protected BookChoice bookChoice() {
        return new BookChoice((BookStorage) bookStorage());
    }

}

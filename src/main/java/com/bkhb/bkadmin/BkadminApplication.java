package com.bkhb.bkadmin;

import com.bkhb.bkadmin.common.repo.SimpleJpaRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(value = "com.bkhb.bkadmin.app.*.repository", repositoryBaseClass = SimpleJpaRepositoryImpl.class)
@SpringBootApplication
public class BkadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BkadminApplication.class, args);
    }

}

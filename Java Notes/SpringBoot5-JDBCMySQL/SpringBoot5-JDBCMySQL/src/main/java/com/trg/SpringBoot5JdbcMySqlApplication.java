package com.trg;

import com.trg.book.BookManager;
import com.trg.jdbcclient.BookManagerForJdbcClient;
import com.trg.serverInfo.TestServerWithDBInitialization;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot5JdbcMySqlApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBoot5JdbcMySqlApplication.class, args);
        //BookManager manager = ctx.getBean(BookManager.class);
        //manager.bookOps();

       // BookManagerForJdbcClient manager1 = ctx.getBean(BookManagerForJdbcClient.class);
       // manager1.bookOps();
       //TestServerWithDBInitialization manager = ctx.getBean(TestServerWithDBInitialization.class);
       //manager.serverOps();
    }

}

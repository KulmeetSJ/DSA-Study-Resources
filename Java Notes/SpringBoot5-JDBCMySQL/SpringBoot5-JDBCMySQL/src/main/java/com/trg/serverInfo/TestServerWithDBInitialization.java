package com.trg.serverInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestServerWithDBInitialization {
    @Autowired
    ServerDao dao;

    public void serverOps(){
        System.out.println("Display Server info...");
        List<Server> list = dao.getServers();
        list.forEach(x -> System.out.println(x));

        System.out.println("Display Server with id 2");
        Server s = dao.getById(1);
        System.out.println(s);
    }
}

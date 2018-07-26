package com.example.penfond.service;

import com.example.penfond.domain.Person;
import io.ebean.EbeanServer;
import io.ebean.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    EbeanServer server;

    public List<Person> getAllPersons() {
        return server.find(Person.class).findList();
    }

    @Transactional
    public Person save(Person person) {
        server.save(person);
        return person;
    }
}

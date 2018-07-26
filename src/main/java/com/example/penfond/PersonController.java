package com.example.penfond;

import com.example.penfond.domain.Person;
import com.example.penfond.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/persons")
    public String listPersons(
            Map<String, Object> model
    ) {
        model.put("persons", personService.getAllPersons());
        return "listPersons";
    }

    @PostMapping(value = "/persons")
    public String add(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName,
            Map<String, Object> model
    ) {
        Person person = new Person(firstName, lastName, 0, 0, new Date());
        personService.save(person);
        model.put("persons", personService.getAllPersons());
        return "listPersons";
    }
}

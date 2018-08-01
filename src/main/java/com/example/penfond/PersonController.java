package com.example.penfond;

import com.example.penfond.domain.Company;
import com.example.penfond.domain.JobInfo;
import com.example.penfond.domain.Person;
import com.example.penfond.service.CompanyService;
import com.example.penfond.service.JobInfoService;
import com.example.penfond.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private JobInfoService jobInfoService;

    @GetMapping(value = "/persons")
    public String listPersons(
            Map<String, Object> model
    ) {
        model.put("persons", personService.getAllPersons());

        return "listPersons";
    }

    @ResponseBody
    @GetMapping(value = "/persons1")
    public List<Person> getAll() {
        return personService.getAllPersons();
    }

    @ResponseBody
    @GetMapping(value = "/persons2")
    public String getAll1() {
        return "listPersons";
    }

    @PostMapping(value = "/persons")
    public String add(
            @RequestParam(name = "firstName") String frstName,
            @RequestParam(name = "lastName") String lastName,
            @RequestParam(name = "patronymic") String patronymic,
            @RequestParam(name = "inn") long inn,
            @RequestParam(name = "snils") long snils,
            @RequestParam(name = "dateOfBirth") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateOfBirth,
            @RequestParam(name="name") String name,
            @RequestParam(name = "base_rate") int base_rate,
            @RequestParam(name = "date_arrival") @DateTimeFormat(pattern="yyyy-MM-dd") Date date_arrival,
            @RequestParam(name = "date_exit") @DateTimeFormat(pattern="yyyy-MM-dd") Date date_exit,
            Map<String, Object> model
    ) {
        Person person = new Person(frstName, lastName, patronymic, inn,snils, dateOfBirth);
        personService.save(person);
        model.put("persons", personService.getAllPersons());
        Company company = new Company(name);
        companyService.save(company);
        model.put("company",companyService.getAllCompany());
        JobInfo jobInfo = new JobInfo(person,company,base_rate,date_arrival,date_exit);
        jobInfoService.save(jobInfo);
        model.put("jobInfo",jobInfoService.getAllJobInf());


        return "listPersons";
    }
}

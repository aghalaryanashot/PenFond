package com.example.penfond.service;

import com.example.penfond.domain.Company;
import io.ebean.EbeanServer;
import io.ebean.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    EbeanServer server;

    public List<Company> getAllCompany(){
        return server.find(Company.class).findList();
    }

    @Transactional
    public Company save(Company company){
        server.save(company);
        return company;
    }

}

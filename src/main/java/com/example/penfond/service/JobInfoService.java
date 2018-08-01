package com.example.penfond.service;

import com.example.penfond.domain.JobInfo;
import io.ebean.EbeanServer;
import io.ebean.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobInfoService {
    @Autowired
    EbeanServer server;
    public List<JobInfo> getAllJobInf() {
        return server.find(JobInfo.class).findList();
    }

    @Transactional
    public JobInfo save(JobInfo jobInfo) {
        server.save(jobInfo);
        return jobInfo;
    }
}

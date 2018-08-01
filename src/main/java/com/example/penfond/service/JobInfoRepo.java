package com.example.penfond.service;

import com.example.penfond.domain.JobInfo;
import org.springframework.data.repository.CrudRepository;

public interface JobInfoRepo extends CrudRepository<JobInfo, Long> {


}

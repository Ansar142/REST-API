package com.ansartech.springbootrest.service;

import com.ansartech.springbootrest.model.JobPost;
import com.ansartech.springbootrest.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo ;
    public void addjob(JobPost jp){
        repo.save(jp);
    }
    public JobPost getJob(int jobId){
        return repo.getJob(jobId);
    }
    public List<JobPost> viewJobs(){
        return repo.viewall();
    }




}

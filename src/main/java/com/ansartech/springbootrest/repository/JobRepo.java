package com.ansartech.springbootrest.repository;
import com.ansartech.springbootrest.model.JobPost;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    private List<JobPost> jobs = new ArrayList<>(Arrays.asList(new JobPost(1, "Software Engineer", "Backend Developer", 2, List.of("Java", "Spring Boot", "MySQL")),
            new JobPost(2, "Frontend Developer", "React Developer", 1, List.of("JavaScript", "React", "CSS"))));

    public void save(JobPost jp){
        jobs.add(jp);

        System.out.println(jp);
    }
    public JobPost getJob(int jobId){
        return (jobs.get(jobId));
    }
    public List<JobPost> viewall(){
        return jobs ;
    }


}

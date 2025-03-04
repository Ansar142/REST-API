package com.ansartech.springbootrest;

import com.ansartech.springbootrest.model.JobPost;
import com.ansartech.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {


    @Autowired
    JobService serv ;

    @GetMapping("jobPost")
    public List<JobPost>viewJob(){
        return serv.viewJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId){
        return serv.getJob(postId);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jb){
        serv.addjob(jb);
    }


    /*@Autowired
    private JobService js ;

    @GetMapping({"/","home"})
    public String Home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleform(JobPost jobPost ){
        js.addjob(jobPost);
        return "success" ;
    }

    @GetMapping("viewalljobs")
    public ModelAndView viewalljobs(ModelAndView mv){

        List<JobPost> jp = js.viewJobs();
        mv.addObject("jobPosts",jp);
        mv.setViewName("viewalljobs");
        return mv ;
    }
*/


}

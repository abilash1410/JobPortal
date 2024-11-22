package com.telusko.jobportal.controller;

import com.telusko.jobportal.model.JobPost;
import com.telusko.jobportal.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    JobService jobService;
    public JobController(JobService jobService){
        this.jobService = jobService;
    }

    @GetMapping(path = "/getAllJobs",produces={"application/json"})
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }

    @PostMapping("/getPost/{postId}/{Id}")
    public JobPost getPostById(@PathVariable("postId")String postId,@PathVariable("Id") int Id){
        return jobService.getPostById(Id);
    }

    @PostMapping(path="/addJob",consumes = "application/json")
    public JobPost addJob (@RequestBody JobPost jobPost) {
        return jobService.addJob(jobPost);
    }

    @PutMapping("/addJob")
    public JobPost updateJobPost (@RequestBody JobPost jobPost){
        return jobService.updateJob(jobPost);
    }

    @DeleteMapping("/jobPost/{postId}")
    public String deletePost(@PathVariable int postId){
        jobService.deletePost(postId);
        return "Deleted the post";
    }
}

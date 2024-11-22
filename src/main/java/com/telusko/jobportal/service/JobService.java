package com.telusko.jobportal.service;


import com.telusko.jobportal.model.JobPost;
import com.telusko.jobportal.repo.JobRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    JobRepo jobRepo;
    public JobService(JobRepo jobRepo){
        this.jobRepo = jobRepo;
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobs();
    }
    public JobPost addJob(JobPost jobPost){
        return jobRepo.addJob(jobPost);
    }

    public JobPost getPostById(int postId) {
        return jobRepo.getPostById(postId);
    }

    public JobPost updateJob(JobPost jobPost) {
        return jobRepo.updateJob(jobPost);
    }

    public void deletePost(int postId) {
        jobRepo.deletePost(postId);
    }
}

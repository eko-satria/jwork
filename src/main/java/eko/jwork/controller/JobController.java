package eko.jwork.controller;

import eko.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/job")
@RestController
public class JobController {

    @RequestMapping(value = "/job", method = RequestMethod.GET)
    public ArrayList<Job> getAllJob()
    {
        ArrayList<Job> job;
        job = DatabaseJob.getJobDatabase();
        return job;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Job getJobById(@PathVariable int id)
    {
        Job job = null;
        try {
            job = DatabaseJob.getJobById(id);
        }
        catch (JobNotFoundException e)
        {
            e.getMessage();
            return null;
        }
        return job;
    }

    @RequestMapping(value = "/{recruiter}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByRecruiter(@PathVariable int id){

        ArrayList<Job> job;
        job = DatabaseJob.getJobByRecruiter(id);
        return job;
    }

    @RequestMapping(value = "/{category}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory jobCategory)
    {
        ArrayList<Job> job;
        job = DatabaseJob.getJobByCategory(jobCategory);
        return job;
    }

    @RequestMapping(value = "/job/", method = RequestMethod.POST)
    public Job addjob(@RequestParam(value = "name") String name,
                      @RequestParam(value = "fee") int  fee,
                      @RequestParam(value = "category") JobCategory category,
                      @RequestParam(value = "recruited") Recruiter recruiter){
        Job job = new Job(DatabaseJob.getLastId()+1, name, fee, category, recruiter);

        if(recruiter.getId() != 0){
            DatabaseJob.addJob(job);
            return job;
        }
        return null;
    }
}

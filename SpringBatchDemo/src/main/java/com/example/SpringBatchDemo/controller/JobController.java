package com.example.SpringBatchDemo.controller;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    @PostMapping("/importData")
    public String jobLauncher(){
        final JobParameters jobParameter = new JobParametersBuilder()
                .addLong("startAt",System.currentTimeMillis()).toJobParameters();

        try {
            JobExecution jobExecution = jobLauncher.run(job,jobParameter);
            return jobExecution.getStatus().toString();
        } catch (JobInstanceAlreadyCompleteException | JobExecutionAlreadyRunningException |
                 JobParametersInvalidException | JobRestartException | ObjectOptimisticLockingFailureException e ) {
        e.printStackTrace();
        return "Job failed due to " + e.getMessage();
        }
    }

}

package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping
    public List<Application> getAll() {
        return applicationService.getAll();
    }

    @PostMapping("/{userEmail}")
    @ResponseStatus(HttpStatus.CREATED)
    public Application create(@RequestBody Application application, @PathVariable String userEmail) {
        return applicationService.save(application, userEmail);
    }

    @GetMapping("/{email}")
    public List<Application> getApplicationsByEmail(@PathVariable String email) {
        return applicationService.getApplicationByEmail(email);
    }

}

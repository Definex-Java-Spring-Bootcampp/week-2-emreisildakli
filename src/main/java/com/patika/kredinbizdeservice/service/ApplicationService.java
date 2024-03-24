package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;
import com.patika.kredinbizdeservice.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    private ApplicationRepository applicationRepository = new ApplicationRepository();
    @Autowired
    private UserService userService;

    public List<Application> getAll() {
        return applicationRepository.getAll();
    }

    public List<Application> getApplicationByEmail(String email) {
        return applicationRepository.findByEmail(email);
    }

    public Application save(Application application, String userEmail) {
        User applicationUser = userService.getByEmail(userEmail);
        if (applicationUser != null) {
            application.setUser(applicationUser);
            applicationRepository.save(application);
        }
        return application;
    }
}

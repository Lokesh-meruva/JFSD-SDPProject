package com.klef.jfsd.finslproject.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.finslproject.models.Application;
import com.klef.jfsd.finslproject.services.ApplicationService;
import com.klef.jfsd.finslproject.services.email;

@RestController
@RequestMapping("/applications")
public class ApplicationController {
	   @Autowired
	    private ApplicationService applicationService;

	    @GetMapping("/all")
	    public List<Application> getAllApplications() {
	        return applicationService.getAllApplications();
	    }

	    @PostMapping("/create")
	    public Application createApplication(@RequestBody Application application) {
	        return applicationService.createApplication(application);
	    }

	    @GetMapping("/{id}")
	    public Application getApplicationById(@PathVariable Long id) {
	        return applicationService.getApplicationById(id);
	    }
	    @PutMapping("/{id}")
	    public Application updateApplication(@PathVariable Long id, @RequestBody Application updatedApplication) {
	        return applicationService.updateApplication(id, updatedApplication);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteApplication(@PathVariable Long id) {
	        applicationService.deleteApplication(id);
	    }

	    @GetMapping("/by-email/{email}")
	    public List<Application> getApplicationsByEmail(@PathVariable String email) {
	        return applicationService.getApplicationsByEmail(email);
	    }
	    private email emailService;

	    @PostMapping("/register")
	    public String registerStudent(@RequestParam String email, @RequestParam String name) {
	        // Save the student registration details

	        // Send the email
	        String subject = "Internship Application Confirmation";
	        String message = "Hello " + name + ",\n\nYou have successfully applied for the scholarship. Thank you for applying!";
	        emailService.sendEmail(email, subject, message);

	        return "Registration successful! A confirmation email has been sent.";
	    }

}

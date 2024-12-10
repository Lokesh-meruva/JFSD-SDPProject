package com.klef.jfsd.finslproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.finslproject.models.Application;
import com.klef.jfsd.finslproject.repository.ApplicationRepository;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    // Retrieve all applications
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    // Retrieve a specific application by ID
    public Application getApplicationById(Long id) {
        return applicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application with ID " + id + " not found."));
    }

    // Create a new application
    public Application createApplication(Application application) {
        return applicationRepository.save(application);
    }

    // Update an existing application
    public Application updateApplication(Long id, Application updatedApplication) {
        Application application = getApplicationById(id);
        application.setStudentName(updatedApplication.getStudentName());
        application.setEmail(updatedApplication.getEmail());
        application.setScholarshipName(updatedApplication.getScholarshipName());
        application.setApplicationStatus(updatedApplication.getApplicationStatus());
        application.setSubmissionDate(updatedApplication.getSubmissionDate());
        return applicationRepository.save(application);
    }

    // Delete an application by ID
    public void deleteApplication(Long id) {
        if (!applicationRepository.existsById(id)) {
            throw new RuntimeException("Application with ID " + id + " does not exist.");
        }
        applicationRepository.deleteById(id);
    }

    // Retrieve applications by student email
    public List<Application> getApplicationsByEmail(String email) {
        return applicationRepository.findByEmail(email);
    }
}

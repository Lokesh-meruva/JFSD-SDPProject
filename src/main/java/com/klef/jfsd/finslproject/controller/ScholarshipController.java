package com.klef.jfsd.finslproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.finslproject.models.Scholarship;
import com.klef.jfsd.finslproject.services.ScholarshipService;

@RestController
@RequestMapping("/scholarships")
public class ScholarshipController {
    @Autowired
    private ScholarshipService scholarshipService;

    @GetMapping
    public List<Scholarship> getAllScholarships() {
        return scholarshipService.getAllScholarships();

    }

    @PostMapping
    public Scholarship createScholarship(@RequestBody Scholarship scholarship) {
        return scholarshipService.createScholarship(scholarship);
    }

    @DeleteMapping("/{id}")
    public void deleteScholarship(@PathVariable Long id) {
        scholarshipService.deleteScholarship(id);
    }

}

package com.klef.jfsd.finslproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.finslproject.models.Scholarship;
import com.klef.jfsd.finslproject.repository.ScholarshipRepository;


@Service
public class ScholarshipService {
    @Autowired
    private ScholarshipRepository scholarshipRepository;

    public List<Scholarship> getAllScholarships() {
        return scholarshipRepository.findAll();
    }

    public Scholarship createScholarship(Scholarship scholarship) {
        return scholarshipRepository.save(scholarship);
    }

    public void deleteScholarship(Long id) {
        scholarshipRepository.deleteById(id);
    }

}

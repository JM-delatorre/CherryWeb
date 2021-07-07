package com.example.estadisticasingsof.service;

import com.example.estadisticasingsof.dao.SubjectRepository;
import com.example.estadisticasingsof.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.estadisticasingsof.dao.SubjectRepository;
import com.example.estadisticasingsof.model.Subject;

import java.util.List;

@Service
public class SubjectImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;


    @Override
    public Iterable<Subject> findAll() {
        return subjectRepository.findAll();
    }


    @Override
    public Page<Subject> findAll(Pageable pageable) {
        return subjectRepository.findAll(pageable);
    }

    @Override
    public Subject findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void insert() {

    }

    @Override
    public List<Subject> findAlls() {
        return subjectRepository.findAll();
    }


}

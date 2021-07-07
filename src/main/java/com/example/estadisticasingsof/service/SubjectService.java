package com.example.estadisticasingsof.service;

import com.example.estadisticasingsof.model.Subject;
import com.example.estadisticasingsof.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SubjectService {

    public Iterable<Subject> findAll();
    public Page<Subject> findAll(Pageable pageable);
    public Subject findById(Long id) throws Exception;
    public Subject save(Subject subject);
    public  void deleteById(Long id);
    public void insert();
    public List<Subject> findAlls();

}

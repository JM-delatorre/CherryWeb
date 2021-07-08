package com.example.estadisticasingsof.service;

import com.example.estadisticasingsof.model.Activity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ActivityService {
    public Iterable<Activity> findAll();
    public Page<Activity> findAll(Pageable pageable);
    public Activity findById(Long id) throws Exception;
    public Activity save(Activity activity);
    public  void deleteById(Long id);
    public void insert();
    public List<Activity> findAlls();
}

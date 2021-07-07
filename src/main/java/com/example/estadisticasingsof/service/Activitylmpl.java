package com.example.estadisticasingsof.service;

import com.example.estadisticasingsof.dao.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.estadisticasingsof.model.Activity;
import java.util.List;


@Service
public class Activitylmpl implements ActivityService{

        @Autowired
        private ActivityRepository activityRepository;


        @Override
        public Iterable<Activity> findAll() {
            return activityRepository.findAll();
        }


        @Override
        public Page<Activity> findAll(Pageable pageable) {
            return activityRepository.findAll(pageable);
        }

        @Override
        public Activity findById(Long id) throws Exception {
            return null;
        }

        @Override
        public Activity save(Activity activity) {
            return activityRepository.save(activity);
        }

        @Override
        public void deleteById(Long id) {

        }

        @Override
        public void insert() {

        }

        @Override
        public List<Activity> findAlls() {
            return activityRepository.findAll();
        }



}

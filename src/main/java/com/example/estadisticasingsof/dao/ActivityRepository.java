package com.example.estadisticasingsof.dao;

import com.example.estadisticasingsof.model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActivityRepository extends MongoRepository<Activity,String> {
}

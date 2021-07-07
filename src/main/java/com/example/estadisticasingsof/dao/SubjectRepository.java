package com.example.estadisticasingsof.dao;

import com.example.estadisticasingsof.model.Subject;
import com.example.estadisticasingsof.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject,String> {

}

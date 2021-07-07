package com.example.estadisticasingsof.controller;
import com.example.estadisticasingsof.dao.SubjectRepository;
import com.example.estadisticasingsof.dao.UserRepository;
import com.example.estadisticasingsof.model.Subject;
import com.example.estadisticasingsof.model.User;
import com.example.estadisticasingsof.service.SubjectService;
import com.example.estadisticasingsof.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import com.example.estadisticasingsof.dao.SubjectRepository;

import java.util.List;

@Controller
@RequestMapping("/Subject")
@CrossOrigin("*")

public class SubjectController {

    @Autowired
    private SubjectService subjectService;


    @GetMapping("/get-all")
    public ResponseEntity<List<Subject>> getAllSubjects(){
        List<Subject>list=subjectService.findAlls();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/saveSubjects")
    public ResponseEntity<Subject> save(@RequestBody Subject subject) {
        try {
            Subject subjectProof = subjectService.save(new Subject(2002, "Maths", 1.0, 1.0, 1.0, 1.0, 1.0, "Sebastian", 1));
            return new ResponseEntity(subjectProof, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.CREATED);
        }
    }

    @PostMapping("/creatingSubjects")
    public ResponseEntity<?> createSubjects(@RequestBody Subject subjectnew){
        Subject obj2=subjectService.save(subjectnew);
        return  new ResponseEntity<Subject>(obj2, HttpStatus.OK);
    }


}


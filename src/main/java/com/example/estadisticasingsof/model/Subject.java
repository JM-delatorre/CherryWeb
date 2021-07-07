package com.example.estadisticasingsof.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;
@Document(collection = "subjects")
public class Subject {
    @Id
    private Integer idSubject;
    private String nameSubject;
    private Double grade1;
    private Double grade2;
    private Double grade3;
    private Double grade4;
    private Double grade5;
    private String teacher;
    private Integer idStudent;



    public Subject(Integer idSubject, String nameSubject, Double grade1, Double grade2, Double grade3, Double grade4, Double grade5, String teacher, Integer idStudent) {
        this.idSubject = idSubject;
        this.nameSubject = nameSubject;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.grade5 = grade5;
        this.teacher = teacher;
        this.idStudent = idStudent;
    }
    public Subject(){}
    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public Double getGrade1() {
        return grade1;
    }

    public void setGrade1(Double grade1) {
        this.grade1 = grade1;
    }

    public Double getGrade2() {
        return grade2;
    }

    public void setGrade2(Double grade2) {
        this.grade2 = grade2;
    }

    public Double getGrade3() {
        return grade3;
    }

    public void setGrade3(Double grade3) {
        this.grade3 = grade3;
    }

    public Double getGrade4() {
        return grade4;
    }

    public void setGrade4(Double grade4) {
        this.grade4 = grade4;
    }

    public Double getGrade5() {
        return grade5;
    }

    public void setGrade5(Double grade5) {
        this.grade5 = grade5;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }
}

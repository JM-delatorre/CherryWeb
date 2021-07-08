package com.example.estadisticasingsof.model;

import org.springframework.data.annotation.Id;

import java.util.Date;


public class Activity {
    @Id
    private Integer idActivity;
    private String name;
    private String details;
    private Date start;
    private Date end;


    public Activity(int id_Activity, String name, String details, Date start, Date end) {
        this.idActivity = idActivity;
        this.name = name;
        this.details = details;
        this.start = start;
        this.end = end;
    }
    public Activity(){}

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}

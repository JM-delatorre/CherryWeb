package com.example.estadisticasingsof.controller;

import com.example.estadisticasingsof.model.Activity;
import com.example.estadisticasingsof.model.User;
import com.example.estadisticasingsof.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/Activity")
@CrossOrigin("*")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping("/getEvents")
    public ResponseEntity<List<Activity>> getEvents(){
        List<Activity>list=activityService.findAlls();
        return ResponseEntity.ok(list);
    }


    @PostMapping("/addEvent")
    public ResponseEntity<?> create(@RequestBody Activity evento){
        Activity obj=activityService.save(evento);
        return  new ResponseEntity<Activity>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/deleteEvent")
    public void borrarPorId(@PathVariable Long id){
        activityService.deleteById(id);
    }

}

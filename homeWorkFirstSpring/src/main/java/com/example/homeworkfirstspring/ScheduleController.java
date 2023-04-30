package com.example.homeworkfirstspring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ScheduleController {
    @RequestMapping(value = "/scheduleGet", method = RequestMethod.GET)
    public List<Schedule> getSchedule(){
        List<Schedule> list = new ArrayList<>();
        list.add(new Schedule("Java"));
        list.add(new Schedule("Algoritms"));
        list.add(new Schedule("JavaScript"));
        return list;
    }
    @RequestMapping(value = "/schedulePost", method = RequestMethod.POST)
    public List<Schedule> postSchedule(){
        List<Schedule> list = new ArrayList<>();
        list.add(new Schedule("Java"));
        list.add(new Schedule("Algoritms"));
        list.add(new Schedule("JavaScript"));
        return list;
    }

    @DeleteMapping(value = "/scheduleDelete/{id}")
    public Schedule deleteSchedule(@PathVariable String id){
        List<Schedule> list = new ArrayList<>();
        list.add(new Schedule("Java"));
        list.add(new Schedule("Algoritms"));
        list.add(new Schedule("JavaScript"));
        int idNumber = Integer.parseInt(id);
        return list.remove(idNumber);
    }
    @PutMapping(value = "/schedulePut/{id}/{name}")
    public Schedule putSchedule(@PathVariable String id, @PathVariable String name){
        List<Schedule> list = new ArrayList<>();
        list.add(new Schedule("Java"));
        list.add(new Schedule("Algoritms"));
        list.add(new Schedule("JavaScript"));
        int idNumber = Integer.parseInt(id);
        return list.set(idNumber,new Schedule(name));
    }
}

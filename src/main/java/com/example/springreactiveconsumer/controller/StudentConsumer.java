package com.example.springreactiveconsumer.controller;

import com.example.springreactiveconsumer.model.Student;
import com.example.springreactiveconsumer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/studentconsumer")
public class StudentConsumer {
    @Autowired
    private StudentService studentService;

    @GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Student> getStudents(){
        return studentService.consumeStudentData();
    }
}

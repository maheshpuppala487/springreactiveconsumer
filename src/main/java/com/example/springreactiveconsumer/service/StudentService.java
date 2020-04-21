package com.example.springreactiveconsumer.service;

import com.example.springreactiveconsumer.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;


import java.time.Duration;
@Service
public class StudentService {

    public Flux<Student> consumeStudentData() {
        WebClient client = WebClient.create("http://localhost:8078");
        return client.get().uri("/student/all").retrieve().bodyToFlux(Student.class).delaySequence(Duration.ofMillis(1000));

    }
}

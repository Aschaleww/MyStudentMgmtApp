package com.example.demo;

import com.example.demo.Entities.Classroom;
import com.example.demo.Entities.Student;
import com.example.demo.Entities.Transcript;
import com.example.demo.Repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Transcript transcript = new Transcript("BS Computer Science");
        Classroom classroom = new Classroom("McLaughlin building", 105);

        Student s1 = new Student( "12", "Anna", "Lynn", "Smith", 3.45,LocalDate.of(2019,5,24));
        s1.setTranscript(transcript);
        s1.setClassroom(classroom);
//        transcript.setStudent(s1); // Important: set student in transcript
//        classroom.setStudent(s1);
        saveStudent(s1);
    }
    public void saveStudent(Student student) {
        studentRepository.save(student);
        System.out.println("Student saved: " + student);
    }
}

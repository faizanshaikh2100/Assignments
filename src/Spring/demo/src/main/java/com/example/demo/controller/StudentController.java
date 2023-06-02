package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repo.CourseRepo;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value="/api/student/course" ,consumes="application/json")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private CourseRepo courseRepo;

    @PostMapping("/createStudent")
    public String createStudent(@RequestBody Student student) {
        Set<Course> courses =  student.getCourses();
        studentRepo.save(student);
         for(Course c : courses){
             courseRepo.save(c);
         }
        return "Successfully added student";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable Long studentId) {
        return studentRepo.findById(studentId).orElse(null);
    }

    @GetMapping("/findByName/{name}")
    public Student findStudentsByName(@PathVariable String name) {
        return studentRepo.findByName(name);
    }

    @GetMapping("/search/{price}")
    public List<Course> findCourseLessThan(@PathVariable int price) {
        return courseRepo.findByPriceLessThan(price);
    }

}
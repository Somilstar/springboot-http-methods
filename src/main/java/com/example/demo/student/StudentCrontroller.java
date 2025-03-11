package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")

public class StudentCrontroller {

    private final StudentService studentService;

    @Autowired
    public StudentCrontroller(StudentService studentService) {
        this.studentService = studentService;
    }



    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void register( @RequestBody Student student){
        studentService.addnewstudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deletestudent(@PathVariable("studentId") Long studentId){
    studentService.deletestudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updatestudent(

            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ){

        studentService.updatestudent(studentId, name , email);
    }






}

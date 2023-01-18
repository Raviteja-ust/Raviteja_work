package com.ust.sec.controller;

import com.ust.sec.entity.Student;
import com.ust.sec.entity.Teacher;
import com.ust.sec.repositary.StudentRepositary;
import com.ust.sec.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;



    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

    @PostMapping("/add")
    public Teacher addNewTeacher(@RequestBody  Teacher teacher)
    {
      return  studentService.addTeacher(teacher);
    }




    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ROLE_TEACHER')")
    public List<Student> getAllTheStudents() {

        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_STUDENT')")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudent(id);
    }




}

package com.ust.sec.controller;

import com.ust.sec.entity.Student;
import com.ust.sec.repositary.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class StdController {
    @Autowired
    private StudentRepositary repo;
    @PostMapping("/post")
    public Student addNewStudent(@RequestBody Student student)
    {
        return repo.save(student);
    }
}

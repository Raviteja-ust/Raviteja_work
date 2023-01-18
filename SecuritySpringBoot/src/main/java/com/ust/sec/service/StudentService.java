package com.ust.sec.service;

import com.ust.sec.entity.Student;
import com.ust.sec.entity.Teacher;
import com.ust.sec.repositary.StudentRepositary;
import com.ust.sec.repositary.TeacherInfoRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {
    List<Student> studentList;

       @Autowired
       private TeacherInfoRepositary teacherInfoRepositary;

       @Autowired
       private StudentRepositary studentRepositary;
       @Autowired
      private PasswordEncoder passwordEncoder;


     /* public  List<Student>  postStudentInfo(){
       Student s1=new Student(101,"Ravi","SEVENTH",89);
       Student s2=new Student(102,"Teju","EIGHT",95);
       Student s3=new Student(103,"Krish","NINTH",98);
           studentList.add(s1);
           studentList.add(s2);
           studentList.add(s3);
          return studentList;
       } */
    public List<Student> getStudents() {
          return studentRepositary.findAll();
    }

    public Student getStudent(int id) {
        return studentRepositary.findById(id).stream()
                .filter(student -> student.getRollNo() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("student " + id + " not found"));
    }

    public Teacher addTeacher(Teacher teacherInfo) {
        teacherInfo.setPassword(passwordEncoder.encode(teacherInfo.getPassword()));
       return teacherInfoRepositary.save(teacherInfo);

    }


  /*  public String deleteStudentById(int id) {
           teacherInfoRepositary.deleteById(id);
           return "StudentDeleted Successfully";
    }

    public Student UpdateStudentInfo(Student student) {
           Student st=new Student();
           st.setRollNo(teacherInfoRepositary.);

    } */
}

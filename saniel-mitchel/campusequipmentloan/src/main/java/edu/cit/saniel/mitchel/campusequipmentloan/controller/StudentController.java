package edu.cit.saniel.mitchel.campusequipmentloan.controller;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.StudentEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController
{
    @Autowired
    public StudentService studentService;

    // POST - add new student
    @PostMapping
    public StudentEntity addStudent(@RequestBody StudentEntity student)
    {
        return studentService.addStudent(student);
    }

    // GET - all students
    @GetMapping
    public List<StudentEntity> getAllStudents()
    {
        return studentService.getAllStudents();
    }
}

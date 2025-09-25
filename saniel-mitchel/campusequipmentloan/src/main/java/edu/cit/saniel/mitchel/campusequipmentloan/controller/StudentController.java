package edu.cit.saniel.mitchel.campusequipmentloan.controller;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.StudentEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

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

    // POST - login student
    @PostMapping("/login")
    public ResponseEntity<StudentEntity> loginStudent(@RequestParam String email, @RequestParam String password)
    {
        Optional<StudentEntity> student = studentService.loginStudent(email, password);

        return student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }

    // POST - login 2
    @PostMapping("/login2")
    public String loginStudent2(@RequestParam String email, @RequestParam String password)
    {
        Optional<StudentEntity> student = studentService.loginStudent(email, password);

        if(student.isEmpty())
        {
            return "User not found";
        }
        else
        {
            return "Login successful";
        }
    }

    // GET - all students
    @GetMapping
    public List<StudentEntity> getAllStudents()
    {
        return studentService.getAllStudents();
    }
}

package edu.cit.saniel.mitchel.campusequipmentloan.service;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.StudentEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    // POST - add new student
    public StudentEntity addStudent(StudentEntity student)
    {
        return studentRepository.save(student);
    }

    // POST - login student
    public Optional<StudentEntity> loginStudent(String email, String password)
    {
        return studentRepository.findByEmailAndPassword(email, password);
    }

    // GET - all students
    public List<StudentEntity> getAllStudents()
    {
        return studentRepository.findAll();
    }
}

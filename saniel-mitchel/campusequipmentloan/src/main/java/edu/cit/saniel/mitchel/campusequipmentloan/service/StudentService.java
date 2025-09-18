package edu.cit.saniel.mitchel.campusequipmentloan.service;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.StudentEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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

    // GET - all students
    public List<StudentEntity> getAllStudents()
    {
        return studentRepository.findAll();
    }
}

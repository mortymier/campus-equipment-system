package edu.cit.saniel.mitchel.campusequipmentloan.repository;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>
{
    public StudentEntity findByStudentId(int studentId);
}

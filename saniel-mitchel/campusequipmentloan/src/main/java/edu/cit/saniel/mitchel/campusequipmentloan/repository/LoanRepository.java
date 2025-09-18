package edu.cit.saniel.mitchel.campusequipmentloan.repository;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.LoanEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Integer>
{
    public List<LoanEntity> findByStudent(StudentEntity student);
    public List<LoanEntity> findByStudentAndStatus(StudentEntity student, LoanEntity.Status status);
}

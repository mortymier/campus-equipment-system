package edu.cit.saniel.mitchel.campusequipmentloan.service;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.LoanEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.entity.StudentEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class LoanService
{
    @Autowired
    public LoanRepository loanRepository;

    // POST - add new loan
    public LoanEntity addLoan(LoanEntity loan, StudentEntity student)
    {
        // Check how many active loans a student has
        LoanEntity.Status status = LoanEntity.Status.ACTIVE;
        List<LoanEntity> activeLoans = loanRepository.findByStudentAndStatus(student, status);

        try
        {
            if(activeLoans.size() >= 2)
            {

            }
        }
        catch(Exception e)
        {

        }

        return loanRepository.save(loan);
    }

    // GET - all loans
    public List<LoanEntity> getAllLoans()
    {
        return loanRepository.findAll();
    }

    // GET - all loans by student
    public List<LoanEntity> getAllLoansByStudent(StudentEntity student)
    {
        return loanRepository.findByStudent(student);
    }
}

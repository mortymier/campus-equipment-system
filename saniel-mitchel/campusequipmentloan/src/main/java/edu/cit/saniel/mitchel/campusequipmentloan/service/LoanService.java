package edu.cit.saniel.mitchel.campusequipmentloan.service;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.LoanEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.entity.StudentEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoanService
{
    @Autowired
    public LoanRepository loanRepository;

    // POST - add new loan
    public LoanEntity addLoan(LoanEntity loan, StudentEntity student)
    {
        List<LoanEntity> loans = loanRepository.findByStudent(student);

        if(loans.size() < 3)
            return loanRepository.save(loan);

        return loanRepository.save(loan);
    }
}

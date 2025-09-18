package edu.cit.saniel.mitchel.campusequipmentloan.controller;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.LoanEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.entity.StudentEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/loans")
public class LoanController
{
    @Autowired
    private LoanService loanService;

    // POST - add loan
    @PostMapping
    public LoanEntity addLoan(@RequestBody LoanEntity loan)
    {
        StudentEntity student = loan.getStudent();
        return loanService.addLoan(loan, student);
    }

    // GET - all loans
    @GetMapping
    public List<LoanEntity> getAllLoans()
    {
        return loanService.getAllLoans();
    }

    // GET - all loans by student
    @GetMapping
    public List<LoanEntity> getAllLoansByStudent(@RequestBody StudentEntity student)
    {
        return loanService.getAllLoansByStudent(student);
    }
}

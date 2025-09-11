package edu.cit.saniel.mitchel.campusequipmentloan.controller;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.LoanEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.entity.StudentEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/loans")
public class LoanController
{
    @Autowired
    private LoanService loanService;

    // POST - add new loan
    public LoanEntity addLoan(@RequestBody LoanEntity loan, StudentEntity student)
    {
        return loanService.addLoan(loan, student);
    }
}

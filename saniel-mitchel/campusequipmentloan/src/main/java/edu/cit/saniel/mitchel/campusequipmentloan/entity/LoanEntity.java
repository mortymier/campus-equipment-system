package edu.cit.saniel.mitchel.campusequipmentloan.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_loans")
public class LoanEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;

    @ManyToOne
    @JoinColumn(name = "fk_equipmentid")
    private EquipmentEntity equipment;

    @ManyToOne
    @JoinColumn(name = "fk_studentid")
    private StudentEntity student;
    private LocalDate startDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private String status;

    public EquipmentEntity getEquipment()
    {
        return this.equipment;
    }

    public StudentEntity getStudent()
    {
        return this.student;
    }

    public LocalDate getStartDate()
    {
        return this.startDate;
    }

    public LocalDate getDueDate()
    {
        return this.dueDate;
    }

    public LocalDate getReturnDate()
    {
        return this.returnDate;
    }

    public String getStatus()
    {
        return this.status;
    }

    public void setEquipment(EquipmentEntity equipment)
    {
        this.equipment = equipment;
    }

    public void setStudent(StudentEntity student)
    {
        this.student = student;
    }

    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    public void setDueDate(LocalDate dueDate)
    {
        this.dueDate = dueDate;
    }

    public void setReturnDate(LocalDate returnDate)
    {
        this.returnDate = returnDate;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}

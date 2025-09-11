package edu.cit.saniel.mitchel.campusequipmentloan.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_students")
public class StudentEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int studentId;
    public int studentNo;
    public String studentName;
    public String email;

    public StudentEntity()
    {
        super();
    }

    // Getters
    public int getStudentNo() { return this.studentNo; }

    public String getStudentName() { return this.studentName; }

    public String getEmail() { return this.email; }

    // Setters
    public void setStudentNo(int studentNo) { this.studentNo = studentNo; }

    public void setStudentName(String studentName) { this.studentName = studentName; }

    public void setEmail(String email) { this.email = email; }
}

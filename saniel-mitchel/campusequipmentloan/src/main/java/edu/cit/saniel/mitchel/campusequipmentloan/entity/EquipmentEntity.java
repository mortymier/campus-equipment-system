package edu.cit.saniel.mitchel.campusequipmentloan.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_equipments")
public class EquipmentEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int equipmentId;
    private String equipmentName;
    private String type;
    private int serialNumber;
    private boolean availability;

    public EquipmentEntity()
    {
        super();
    }

    // Getters
    public String getEquipmentName()
    {
        return this.equipmentName;
    }

    public String getType()
    {
        return this.type;
    }

    public int getSerialNumber()
    {
        return this.serialNumber;
    }

    public boolean getAvailability()
    {
        return availability;
    }

    // Setters
    public void setEquipmentName(String equipmentName)
    {
        this.equipmentName = equipmentName;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public void setAvailability(boolean availability)
    {
        this.availability = availability;
    }
}

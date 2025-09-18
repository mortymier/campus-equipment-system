package edu.cit.saniel.mitchel.campusequipmentloan.controller;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.EquipmentEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/equipment")
public class EquipmentController
{
    @Autowired
    private EquipmentService equipmentService;

    // POST - add new equipment
    @PostMapping
    public EquipmentEntity addEquipment(@RequestBody EquipmentEntity equipment)
    {
        return equipmentService.addEquipment(equipment);
    }

    // GET - all equipments
    @GetMapping
    public List<EquipmentEntity> getAllEquipments()
    {
        return equipmentService.getAllEquipments();
    }

    // GET - all available equipments
    @GetMapping("/available")
    public List<EquipmentEntity> getAllAvailableEquipments()
    {
        return equipmentService.getAllAvailableEquipments();
    }
}

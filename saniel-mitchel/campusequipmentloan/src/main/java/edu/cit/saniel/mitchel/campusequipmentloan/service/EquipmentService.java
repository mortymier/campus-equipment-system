package edu.cit.saniel.mitchel.campusequipmentloan.service;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.EquipmentEntity;
import edu.cit.saniel.mitchel.campusequipmentloan.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EquipmentService
{
    @Autowired
    private EquipmentRepository equipmentRepository;

    // POST - add new equipment
    public EquipmentEntity addEquipment(EquipmentEntity equipment)
    {
        return equipmentRepository.save(equipment);
    }

    // GET - all available equipments
    public List<EquipmentEntity> getAllAvailableEquipments()
    {
        boolean availability = true;
        return equipmentRepository.findByAvailability(availability);
    }
}

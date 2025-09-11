package edu.cit.saniel.mitchel.campusequipmentloan.repository;

import edu.cit.saniel.mitchel.campusequipmentloan.entity.EquipmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<EquipmentEntity, Integer>
{
    public List<EquipmentEntity> findByAvailability(boolean availability);
}

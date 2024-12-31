package tn.esprit.Pathologie.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.Pathologie.Entities.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Long> {
}

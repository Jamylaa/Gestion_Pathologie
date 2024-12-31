package tn.esprit.Pathologie.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Pathologie.Entities.FamilleActe;
import tn.esprit.Pathologie.Entities.Patient;

public interface IFamilleActeRepository extends JpaRepository<FamilleActe, Long> {
}

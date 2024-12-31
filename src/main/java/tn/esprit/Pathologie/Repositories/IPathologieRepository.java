package tn.esprit.Pathologie.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Pathologie.Entities.Pathologie;
import tn.esprit.Pathologie.Entities.Patient;

public interface IPathologieRepository extends JpaRepository<Pathologie, Long> {
    Pathologie findPathologieByCodePath(String codePath);
}

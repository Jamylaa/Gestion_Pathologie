package tn.esprit.Pathologie.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Pathologie.Entities.Acte;

public interface IActeRepository extends JpaRepository<Acte, Long> {
}

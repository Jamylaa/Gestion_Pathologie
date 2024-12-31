package tn.esprit.Pathologie.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Pathologie.Entities.Pathologie;
import tn.esprit.Pathologie.Repositories.IActeRepository;
import tn.esprit.Pathologie.Repositories.IFamilleActeRepository;
import tn.esprit.Pathologie.Repositories.IPathologieRepository;
import tn.esprit.Pathologie.Repositories.IPatientRepository;

@Service
public class PathologieService implements IPathologieService{
    @Autowired
    private IPatientRepository patientRepository;
    @Autowired
    private IActeRepository acteRepository;
    @Autowired
    private IPathologieRepository pathologieRepository;
    @Autowired
    private IFamilleActeRepository familleActeRepository;

    @Override
    public Pathologie ajouterPathologie(Pathologie p) {
        return pathologieRepository.save(p);
    }
}

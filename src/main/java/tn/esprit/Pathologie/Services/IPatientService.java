package tn.esprit.Pathologie.Services;

import tn.esprit.Pathologie.Entities.Patient;

public interface IPatientService {
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String
            codePath);
}

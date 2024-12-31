package tn.esprit.Pathologie.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Pathologie.Entities.Patient;
import tn.esprit.Pathologie.Services.ActeService;
import tn.esprit.Pathologie.Services.FamilleActeService;
import tn.esprit.Pathologie.Services.PathologieService;
import tn.esprit.Pathologie.Services.PatientService;

@RestController
@RequestMapping("/Patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private FamilleActeService familleActeService;
    @Autowired
    private ActeService acteService;
    @Autowired
    private PathologieService pathologieService;

    @PostMapping("ajouterPatientEtAffecterAPathologie")
    public Patient ajouterPatientEtAffecterAPathologie(@RequestBody Patient patient,
        @RequestParam String codePathologie) {
        return patientService.ajouterPatientEtAffecterAPathologie(patient,codePathologie);
    }

}

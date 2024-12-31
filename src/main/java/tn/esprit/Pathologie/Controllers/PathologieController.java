package tn.esprit.Pathologie.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.Pathologie.Entities.Pathologie;
import tn.esprit.Pathologie.Services.ActeService;
import tn.esprit.Pathologie.Services.FamilleActeService;
import tn.esprit.Pathologie.Services.PathologieService;
import tn.esprit.Pathologie.Services.PatientService;

@RestController
@RequestMapping("/Pathologie")
public class PathologieController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private FamilleActeService familleActeService;
    @Autowired
    private ActeService acteService;
    @Autowired
    private PathologieService pathologieService;

    @PostMapping("/ajouter Pathologie")
    public Pathologie ajouterPathologie(@RequestBody Pathologie p) {
        return pathologieService.ajouterPathologie(p);
    }

}

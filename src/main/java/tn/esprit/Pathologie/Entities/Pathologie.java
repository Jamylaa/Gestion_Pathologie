package tn.esprit.Pathologie.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Pathologie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPath;
    private String codePath;
    private String libelle;
    private String description;
    private boolean archive=false;


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Acte> actes;

    public String getCodePath() {return codePath;}

    public void setCodePath(String codePath) {this.codePath = codePath;}

    public String getLibelle() {return libelle;}

    public void setLibelle(String libelle) {this.libelle = libelle;}

    public Long getIdPath() {return idPath;}

    public void setIdPath(Long idPath) {this.idPath = idPath;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public boolean isArchive() {return archive;}

    public void setArchive(boolean archive) {this.archive = archive;}
}
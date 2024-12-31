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
public class FamilleActe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFA;
    private String codeFA;
    private String libelle;
    private String description;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "familleActe")
    private List<Acte>actes;

    public String getLibelle() {return libelle;}

    public void setLibelle(String libelle) {this.libelle = libelle;}

    public Long getIdFA() {return idFA;}

    public void setIdFA(Long idFA) {this.idFA = idFA;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getCodeFA() {return codeFA;}

    public void setCodeFA(String codeFA) {this.codeFA = codeFA;}


}
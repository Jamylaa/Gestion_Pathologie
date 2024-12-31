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
public class Acte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActe;
    private String codeActe;
    private int cotationActe;
    private float prixUnitaireActe;
    private String descriptionActe;

    @ManyToOne
    private FamilleActe familleActe;

    @ManyToMany(mappedBy = "actes",cascade = CascadeType.ALL)
    private List<Pathologie> pathologies;

    public float getPrixUnitaireActe() {return prixUnitaireActe;}

    public void setPrixUnitaireActe(float prixUnitaireActe) {this.prixUnitaireActe = prixUnitaireActe;}

    public Long getIdActe() {return idActe;}

    public void setIdActe(Long idActe) {this.idActe = idActe;}

    public String getDescriptionActe() {return descriptionActe;}

    public void setDescriptionActe(String descriptionActe) {this.descriptionActe = descriptionActe;}

    public int getCotationActe() {return cotationActe;}

    public void setCotationActe(int cotationActe) {this.cotationActe = cotationActe;}

    public String getCodeActe() {return codeActe;}

    public void setCodeActe(String codeActe) {this.codeActe = codeActe;}

}

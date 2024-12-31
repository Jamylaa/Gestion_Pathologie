package tn.esprit.Pathologie.Entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.Pathologie.Enum.TypePieceIdendite;

import java.util.Date;
import java.util.List;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;
    @Enumerated(EnumType.STRING)
    private TypePieceIdendite typePieceIdendite;
    private String IdentifiantPieceIdentite;
    private Date DateEmission;
    private String NomP;
    private String PrenomP;

    @ManyToMany
    private List<Pathologie>pathologies;

    public void setIdPatient(Long idPatient) {this.idPatient = idPatient;}

    public Long getIdPatient() {return idPatient;}

    public String getNomP() {return NomP;}

    public void setNomP(String nomP) {NomP = nomP;}

    public String getPrenomP() {return PrenomP;}

    public void setPrenomP(String prenomP) {PrenomP = prenomP;}

    public TypePieceIdendite getTypePieceIdendite() {return typePieceIdendite;}

    public void setTypePieceIdendite(TypePieceIdendite typePieceIdendite) {this.typePieceIdendite = typePieceIdendite;}

    public String getIdentifiantPieceIdentite() {return IdentifiantPieceIdentite;}

    public void setIdentifiantPieceIdentite(String identifiantPieceIdentite) {IdentifiantPieceIdentite = identifiantPieceIdentite;}

    public Date getDateEmission() {return DateEmission;}

    public void setDateEmission(Date dateEmission) {DateEmission = dateEmission;}



}

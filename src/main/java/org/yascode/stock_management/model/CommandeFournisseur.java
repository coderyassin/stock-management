package org.yascode.stock_management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.yascode.stock_management.util.enums.EtatCommande;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commandes_fournisseur")
@Builder
public class CommandeFournisseur extends AbstractEntity {
    @Column(name = "code")
    private String code;

    @Column(name = "datecommande")
    private Instant dateCommande;

    @Column(name = "etatcommande")
    @Enumerated(EnumType.STRING)
    private EtatCommande etatCommande;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "entreprise_id", nullable = false)
    @JsonIgnore
    private Entreprise entreprise;

    @ManyToOne
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
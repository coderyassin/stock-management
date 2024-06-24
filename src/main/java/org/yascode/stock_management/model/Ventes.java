package org.yascode.stock_management.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ventes")
@Builder
public class Ventes extends AbstractEntity {
    @Column(name = "code")
    private String code;

    @Column(name = "datevente")
    private Instant dateVente;

    @Column(name = "commentaire")
    private String commentaire;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes;
}

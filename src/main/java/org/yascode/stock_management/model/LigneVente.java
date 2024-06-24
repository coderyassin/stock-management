package org.yascode.stock_management.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lignes_vente")
@Builder
public class LigneVente extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "vente_id")
    private Ventes vente;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;
}

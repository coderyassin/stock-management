package org.yascode.stock_management.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ligne_commandes_client")
@Builder
public class LigneCommandeClient extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "commande_client_id")
    private CommandeClient commandeClient;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prix_unitaire")
    private BigDecimal prixUnitaire;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;
}

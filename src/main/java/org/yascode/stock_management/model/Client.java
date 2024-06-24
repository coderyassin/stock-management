package org.yascode.stock_management.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clients")
@Builder
public class Client extends AbstractEntity {
    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "mail")
    private String mail;

    @Column(name = "numTel")
    private String numTel;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;
}

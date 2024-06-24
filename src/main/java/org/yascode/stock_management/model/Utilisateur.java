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
@Table(name = "utilisateurs")
@Builder
public class Utilisateur extends AbstractEntity {
    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "datedenaissance")
    private Instant dateDeNaissance;

    @Column(name = "motdepasse")
    private String moteDePasse;

    @Column(name = "photo")
    private String photo;

    @Embedded
    private Adresse adresse;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "utilisateur")
    private List<Roles> roles;
}
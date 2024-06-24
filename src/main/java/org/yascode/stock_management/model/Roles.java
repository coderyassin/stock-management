package org.yascode.stock_management.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
@Builder
public class Roles extends AbstractEntity {
    @Column(name = "role_name")
    private String roleName;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}
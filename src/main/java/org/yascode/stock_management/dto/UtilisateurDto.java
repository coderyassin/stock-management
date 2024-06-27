package org.yascode.stock_management.dto;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UtilisateurDto {
  private Integer id;
  private String nom;
  private String prenom;
  private String email;
  private Instant dateDeNaissance;
  private String moteDePasse;
  private AdresseDto adresse;
  private String photo;
  private EntrepriseDto entreprise;
  private List<RolesDto> roles;
}

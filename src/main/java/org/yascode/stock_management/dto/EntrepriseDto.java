package org.yascode.stock_management.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EntrepriseDto {
  private Integer id;
  private String nom;
  private String description;
  private AdresseDto adresse;
  private String codeFiscal;
  private String photo;
  private String email;
  private String numTel;
  private String steWeb;
  @JsonIgnore
  private List<UtilisateurDto> utilisateurs;
}

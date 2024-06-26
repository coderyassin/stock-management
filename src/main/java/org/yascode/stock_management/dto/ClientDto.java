package org.yascode.stock_management.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDto {
  private Integer id;
  private String nom;
  private String prenom;
  private AdresseDto adresse;
  private String photo;
  private String mail;
  private String numTel;
  private EntrepriseDto entrepris;
  @JsonIgnore
  private List<CommandeClientDto> commandeClients;
}

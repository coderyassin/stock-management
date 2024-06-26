package org.yascode.stock_management.dto;

import lombok.*;
import org.yascode.stock_management.util.enums.EtatCommande;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommandeClientDto {
  private Integer id;
  private String code;
  private Instant dateCommande;
  private EtatCommande etatCommande;
  private ClientDto client;
  private EntrepriseDto entreprise;
  private List<LigneCommandeClientDto> ligneCommandeClients;
}

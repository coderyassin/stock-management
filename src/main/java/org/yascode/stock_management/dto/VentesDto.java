package org.yascode.stock_management.dto;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VentesDto {
  private Integer id;
  private String code;
  private Instant dateVente;
  private String commentaire;
  private List<LigneVenteDto> ligneVentes;
  private EntrepriseDto entreprise;
}

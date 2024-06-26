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
public class CommandeFournisseurDto {
  private Integer id;
  private String code;
  private Instant dateCommande;
  private EtatCommande etatCommande;
  private FournisseurDto fournisseur;
  private EntrepriseDto entreprise;
  private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
}

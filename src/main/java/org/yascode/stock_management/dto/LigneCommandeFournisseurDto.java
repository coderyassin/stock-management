package org.yascode.stock_management.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LigneCommandeFournisseurDto {
  private Integer id;
  private ArticleDto article;
  private CommandeFournisseurDto commandeFournisseur;
  private BigDecimal quantite;
  private BigDecimal prixUnitaire;
  private EntrepriseDto entreprise;
}

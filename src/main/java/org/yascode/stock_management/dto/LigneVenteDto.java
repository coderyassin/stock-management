package org.yascode.stock_management.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LigneVenteDto {
  private Integer id;
  private VentesDto vente;
  private ArticleDto article;
  private BigDecimal quantite;
  private BigDecimal prixUnitaire;
  private EntrepriseDto entreprise;
}

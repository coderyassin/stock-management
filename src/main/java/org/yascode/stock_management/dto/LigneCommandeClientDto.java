package org.yascode.stock_management.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LigneCommandeClientDto {
  private Integer id;
  private ArticleDto article;
  @JsonIgnore
  private CommandeClientDto commandeClient;
  private BigDecimal quantite;
  private BigDecimal prixUnitaire;
  private EntrepriseDto entreprise;
}

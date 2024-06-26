package org.yascode.stock_management.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleDto {
  private Integer id;
  private String codeArticle;
  private String designation;
  private BigDecimal prixUnitaireHt;
  private BigDecimal tauxTva;
  private BigDecimal prixUnitaireTtc;
  private String photo;
  private CategoryDto category;
  private EntrepriseDto entreprise;
}

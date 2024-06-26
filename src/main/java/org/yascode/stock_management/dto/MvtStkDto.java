package org.yascode.stock_management.dto;

import lombok.*;
import org.yascode.stock_management.util.enums.SourceMvtStk;
import org.yascode.stock_management.util.enums.TypeMvtStk;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MvtStkDto {
  private Integer id;
  private Instant dateMvt;
  private BigDecimal quantite;
  private ArticleDto article;
  private TypeMvtStk typeMvt;
  private SourceMvtStk sourceMvt;
  private EntrepriseDto entreprise;
}

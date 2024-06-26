package org.yascode.stock_management.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdresseDto {
  private String adresse1;
  private String adresse2;
  private String ville;
  private String codePostale;
  private String pays;
}

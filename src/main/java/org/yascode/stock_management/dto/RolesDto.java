package org.yascode.stock_management.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RolesDto {
  private Integer id;
  private String roleName;
  @JsonIgnore
  private UtilisateurDto utilisateur;
}

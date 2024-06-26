package org.yascode.stock_management.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDto {
  private Integer id;
  private String code;
  private String designation;
  private Integer idEntreprise;
  @JsonIgnore
  private List<ArticleDto> articles;
}

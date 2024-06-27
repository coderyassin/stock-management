package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.ArticleDto;
import org.yascode.stock_management.model.Article;

public interface ArticleMapper {
    ArticleDto toDto(Article article);
    Article toEntity(ArticleDto articleDto);
}


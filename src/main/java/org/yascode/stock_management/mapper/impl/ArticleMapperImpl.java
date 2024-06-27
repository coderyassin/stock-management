package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.ArticleDto;
import org.yascode.stock_management.mapper.ArticleMapper;
import org.yascode.stock_management.model.Article;

@Service
public class ArticleMapperImpl implements ArticleMapper {
    private final ModelMapper mapper;

    public ArticleMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ArticleDto toDto(Article article) {
        return mapper.map(article, ArticleDto.class);
    }

    @Override
    public Article toEntity(ArticleDto articleDto) {
        return mapper.map(articleDto, Article.class);
    }
}

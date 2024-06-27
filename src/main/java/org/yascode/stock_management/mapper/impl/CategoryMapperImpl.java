package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.CategoryDto;
import org.yascode.stock_management.mapper.CategoryMapper;
import org.yascode.stock_management.model.Category;

@Service
public class CategoryMapperImpl implements CategoryMapper {
    private final ModelMapper mapper;

    public CategoryMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public CategoryDto toDto(Category category) {
        return mapper.map(category, CategoryDto.class);
    }

    @Override
    public Category toEntity(CategoryDto categoryDto) {
        return mapper.map(categoryDto, Category.class);
    }
}

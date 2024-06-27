package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.CategoryDto;
import org.yascode.stock_management.model.Category;

public interface CategoryMapper {
    CategoryDto toDto(Category category);
    Category toEntity(CategoryDto categoryDto);
}

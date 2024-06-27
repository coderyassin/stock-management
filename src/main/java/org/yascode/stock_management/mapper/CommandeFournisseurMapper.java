package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.CommandeFournisseurDto;
import org.yascode.stock_management.model.CommandeFournisseur;

public interface CommandeFournisseurMapper {
    CommandeFournisseurDto toDto(CommandeFournisseur entity);
    CommandeFournisseur toEntity(CommandeFournisseurDto dto);
}

package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.LigneCommandeFournisseurDto;
import org.yascode.stock_management.model.LigneCommandeFournisseur;

public interface LigneCommandeFournisseurMapper {
    LigneCommandeFournisseurDto toDto(LigneCommandeFournisseur entity);
    LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto dto);
}

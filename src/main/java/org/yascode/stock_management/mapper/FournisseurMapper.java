package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.FournisseurDto;
import org.yascode.stock_management.model.Fournisseur;

public interface FournisseurMapper {
    FournisseurDto toDto(Fournisseur fournisseur);
    Fournisseur toEntity(FournisseurDto fournisseurDto);
}

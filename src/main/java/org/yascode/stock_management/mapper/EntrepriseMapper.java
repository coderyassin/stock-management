package org.yascode.stock_management.mapper;

import org.yascode.stock_management.model.Entreprise;

public interface EntrepriseMapper {
    Entreprise toDto(Entreprise entreprise);
    Entreprise toEntity(Entreprise entreprise);
}

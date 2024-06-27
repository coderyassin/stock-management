package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.LigneVenteDto;
import org.yascode.stock_management.model.LigneVente;

public interface LigneVenteMapper {
    LigneVenteDto toDto(LigneVente ligneVente);
    LigneVente toEntity(LigneVenteDto ligneVenteDto);
}

package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.LigneCommandeClientDto;
import org.yascode.stock_management.model.LigneCommandeClient;

public interface LigneCommandeClientMapper {
    LigneCommandeClientDto toDto(LigneCommandeClientDto dto);
    LigneCommandeClient toEntity(LigneCommandeClientDto dto);
}

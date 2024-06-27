package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.VentesDto;
import org.yascode.stock_management.model.Ventes;

public interface VentesMapper {
    VentesDto toDto(Ventes ventes);
    Ventes toEntity(VentesDto ventesDto);
}

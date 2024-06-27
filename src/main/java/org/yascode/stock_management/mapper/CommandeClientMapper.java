package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.CommandeClientDto;
import org.yascode.stock_management.model.CommandeClient;

public interface CommandeClientMapper {
    CommandeClientDto toDto(CommandeClient commandeClient);
    CommandeClient toEntity(CommandeClientDto commandeClientDto);
}

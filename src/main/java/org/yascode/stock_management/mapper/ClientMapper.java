package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.ClientDto;
import org.yascode.stock_management.model.Client;

public interface ClientMapper {
    ClientDto toDto(Client client);
    Client toEntity(ClientDto clientDto);
}

package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.ClientDto;
import org.yascode.stock_management.mapper.ClientMapper;
import org.yascode.stock_management.model.Client;

@Service
public class ClientMapperImpl implements ClientMapper {
    private final ModelMapper mapper;

    public ClientMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ClientDto toDto(Client client) {
        return mapper.map(client, ClientDto.class);
    }

    @Override
    public Client toEntity(ClientDto clientDto) {
        return mapper.map(clientDto, Client.class);
    }
}

package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.CommandeClientDto;
import org.yascode.stock_management.mapper.CommandeClientMapper;
import org.yascode.stock_management.model.CommandeClient;

@Service
public class CommandeClientMapperImpl implements CommandeClientMapper {
    private final ModelMapper mapper;

    public CommandeClientMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public CommandeClientDto toDto(CommandeClient commandeClient) {
        return mapper.map(commandeClient, CommandeClientDto.class);
    }

    @Override
    public CommandeClient toEntity(CommandeClientDto commandeClientDto) {
        return mapper.map(commandeClientDto, CommandeClient.class);
    }
}

package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.LigneCommandeClientDto;
import org.yascode.stock_management.mapper.LigneCommandeClientMapper;
import org.yascode.stock_management.model.LigneCommandeClient;

@Service
public class LigneCommandeClientMapperImpl implements LigneCommandeClientMapper {
    private final ModelMapper mapper;

    public LigneCommandeClientMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public LigneCommandeClientDto toDto(LigneCommandeClientDto dto) {
        return mapper.map(dto, LigneCommandeClientDto.class);
    }

    @Override
    public LigneCommandeClient toEntity(LigneCommandeClientDto dto) {
        return mapper.map(dto, LigneCommandeClient.class);
    }
}

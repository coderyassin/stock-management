package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.CommandeFournisseurDto;
import org.yascode.stock_management.mapper.CommandeFournisseurMapper;
import org.yascode.stock_management.model.CommandeFournisseur;

@Service
public class CommandeFournisseurMapperImpl implements CommandeFournisseurMapper {
    private final ModelMapper mapper;

    public CommandeFournisseurMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public CommandeFournisseurDto toDto(CommandeFournisseur entity) {
        return mapper.map(entity, CommandeFournisseurDto.class);
    }

    @Override
    public CommandeFournisseur toEntity(CommandeFournisseurDto dto) {
        return mapper.map(dto, CommandeFournisseur.class);
    }
}

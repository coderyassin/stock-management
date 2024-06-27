package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.LigneCommandeFournisseurDto;
import org.yascode.stock_management.mapper.LigneCommandeFournisseurMapper;
import org.yascode.stock_management.model.LigneCommandeFournisseur;

@Service
public class LigneCommandeFournisseurMapperImpl implements LigneCommandeFournisseurMapper {
    private final ModelMapper mapper;

    public LigneCommandeFournisseurMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public LigneCommandeFournisseurDto toDto(LigneCommandeFournisseur entity) {
        return mapper.map(entity, LigneCommandeFournisseurDto.class);
    }

    @Override
    public LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto dto) {
        return mapper.map(dto, LigneCommandeFournisseur.class);
    }
}

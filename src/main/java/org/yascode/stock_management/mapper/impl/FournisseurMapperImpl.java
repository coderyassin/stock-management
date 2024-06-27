package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.FournisseurDto;
import org.yascode.stock_management.mapper.FournisseurMapper;
import org.yascode.stock_management.model.Fournisseur;

@Service
public class FournisseurMapperImpl implements FournisseurMapper {
    private final ModelMapper mapper;

    public FournisseurMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public FournisseurDto toDto(Fournisseur fournisseur) {
        return mapper.map(fournisseur, FournisseurDto.class);
    }

    @Override
    public Fournisseur toEntity(FournisseurDto fournisseurDto) {
        return mapper.map(fournisseurDto, Fournisseur.class);
    }
}

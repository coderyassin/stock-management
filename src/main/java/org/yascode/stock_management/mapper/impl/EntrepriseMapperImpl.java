package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.mapper.EntrepriseMapper;
import org.yascode.stock_management.model.Entreprise;

@Service
public class EntrepriseMapperImpl implements EntrepriseMapper {
    private final ModelMapper mapper;

    public EntrepriseMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Entreprise toDto(Entreprise entreprise) {
        return mapper.map(entreprise, Entreprise.class);
    }

    @Override
    public Entreprise toEntity(Entreprise entreprise) {
        return mapper.map(entreprise, Entreprise.class);
    }
}

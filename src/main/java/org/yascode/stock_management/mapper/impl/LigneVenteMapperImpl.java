package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.LigneVenteDto;
import org.yascode.stock_management.mapper.LigneVenteMapper;
import org.yascode.stock_management.model.LigneVente;

@Service
public class LigneVenteMapperImpl implements LigneVenteMapper {
    private final ModelMapper mapper;

    public LigneVenteMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public LigneVenteDto toDto(LigneVente ligneVente) {
        return mapper.map(ligneVente, LigneVenteDto.class);
    }

    @Override
    public LigneVente toEntity(LigneVenteDto ligneVenteDto) {
        return mapper.map(ligneVenteDto, LigneVente.class);
    }
}

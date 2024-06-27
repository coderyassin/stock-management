package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.AdresseDto;
import org.yascode.stock_management.mapper.AdresseMapper;
import org.yascode.stock_management.model.Adresse;

@Service
public class AdresseMapperImpl implements AdresseMapper {
    private final ModelMapper mapper;

    public AdresseMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public AdresseDto toDto(Adresse adresse) {
        return mapper.map(adresse, AdresseDto.class);
    }

    @Override
    public Adresse toEntity(AdresseDto adresseDto) {
        return mapper.map(adresseDto, Adresse.class);
    }
}

package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.VentesDto;
import org.yascode.stock_management.mapper.VentesMapper;
import org.yascode.stock_management.model.Ventes;

@Service
public class VentesMapperImpl implements VentesMapper {
    private final ModelMapper mapper;

    public VentesMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public VentesDto toDto(Ventes ventes) {
        return mapper.map(ventes, VentesDto.class);
    }

    @Override
    public Ventes toEntity(VentesDto ventesDto) {
        return mapper.map(ventesDto, Ventes.class);
    }
}

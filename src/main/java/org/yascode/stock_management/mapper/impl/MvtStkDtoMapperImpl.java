package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.MvtStkDto;
import org.yascode.stock_management.mapper.MvtStkDtoMapper;
import org.yascode.stock_management.model.MvtStk;

@Service
public class MvtStkDtoMapperImpl implements MvtStkDtoMapper {
    private final ModelMapper mapper;

    public MvtStkDtoMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public MvtStkDto toDto(MvtStk mvtStk) {
        return mapper.map(mvtStk, MvtStkDto.class);
    }

    @Override
    public MvtStkDto toEntity(MvtStkDto mvtStkDto) {
        return mapper.map(mvtStkDto, MvtStkDto.class);
    }
}

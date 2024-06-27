package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.RolesDto;
import org.yascode.stock_management.mapper.RolesMapper;
import org.yascode.stock_management.model.Roles;

@Service
public class RolesMapperImpl implements RolesMapper {
    private final ModelMapper mapper;

    public RolesMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public RolesDto toDto(Roles roles) {
        return mapper.map(roles, RolesDto.class);
    }

    @Override
    public Roles toEntity(RolesDto rolesDto) {
        return mapper.map(rolesDto, Roles.class);
    }
}

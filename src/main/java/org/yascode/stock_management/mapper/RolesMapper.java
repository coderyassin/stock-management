package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.RolesDto;
import org.yascode.stock_management.model.Roles;

public interface RolesMapper {
    RolesDto toDto(Roles roles);
    Roles toEntity(RolesDto rolesDto);
}

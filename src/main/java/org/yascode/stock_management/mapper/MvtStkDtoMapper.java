package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.MvtStkDto;
import org.yascode.stock_management.model.MvtStk;

public interface MvtStkDtoMapper {
    MvtStkDto toDto(MvtStk mvtStk);
    MvtStkDto toEntity(MvtStkDto mvtStkDto);
}

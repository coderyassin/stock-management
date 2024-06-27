package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.AdresseDto;
import org.yascode.stock_management.model.Adresse;

public interface AdresseMapper {
    AdresseDto toDto(Adresse adresse);
    Adresse toEntity(AdresseDto adresseDto);
}

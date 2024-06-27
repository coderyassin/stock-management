package org.yascode.stock_management.mapper.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.yascode.stock_management.dto.UtilisateurDto;
import org.yascode.stock_management.mapper.UtilisateurMapper;
import org.yascode.stock_management.model.Utilisateur;

@Service
public class UtilisateurMapperImpl implements UtilisateurMapper {
    private final ModelMapper mapper;

    public UtilisateurMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public UtilisateurDto toDto(Utilisateur utilisateur) {
        return mapper.map(utilisateur, UtilisateurDto.class);
    }

    @Override
    public Utilisateur toEntity(UtilisateurDto utilisateurDto) {
        return mapper.map(utilisateurDto, Utilisateur.class);
    }
}

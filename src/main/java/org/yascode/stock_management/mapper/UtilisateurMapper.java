package org.yascode.stock_management.mapper;

import org.yascode.stock_management.dto.UtilisateurDto;
import org.yascode.stock_management.model.Utilisateur;

public interface UtilisateurMapper {
    UtilisateurDto  toDto(Utilisateur utilisateur);
    Utilisateur toEntity(UtilisateurDto utilisateurDto);
}

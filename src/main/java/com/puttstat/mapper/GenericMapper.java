package com.puttstat.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface GenericMapper <Entity, DTO> {

    Entity toEntity(DTO dto);

    DTO toDTO(Entity entity);
}

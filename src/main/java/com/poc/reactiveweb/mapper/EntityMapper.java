package com.poc.reactiveweb.mapper;

import com.poc.reactiveweb.dto.EntityDto;
import com.poc.reactiveweb.entity.Entity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntityMapper {

    EntityDto toDto(Entity entity);

    Entity toEntity(EntityDto dto);

    List<EntityDto> toDtoList(List<Entity> source);

    List<Entity> toEntityList(List<EntityDto> source);
}

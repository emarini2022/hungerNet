package com.hunger.net.converter;

public interface AbstractConverter <ENTITY, DTO> {

    public abstract ENTITY toEntity(DTO dto);

    public abstract DTO toDto(ENTITY entity);

}

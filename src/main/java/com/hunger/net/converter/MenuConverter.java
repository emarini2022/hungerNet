package com.hunger.net.converter;

import com.hunger.net.builder.MenuBuilder;
import com.hunger.net.builder.MenuDTOBuilder;
import com.hunger.net.dto.MenuDTO;
import com.hunger.net.io.entity.MenuEntity;

public class MenuConverter implements AbstractConverter <MenuEntity, MenuDTO> {

    @Override
    public MenuEntity toEntity (MenuDTO menuDTO) {
        return new MenuBuilder()
                .withId(menuDTO.getId())
                .withContent(menuDTO.getContent())
                .withPrice(menuDTO.getPrice())
                .withTitle(menuDTO.getTitle())
                .build();
    }

    @Override
    public MenuDTO toDto (MenuEntity menuEntity) {
        return new MenuDTOBuilder()
                .withId(menuEntity.getId())
                .withContent(menuEntity.getContent())
                .withPrice(menuEntity.getPrice())
                .withTitle(menuEntity.getTitle())
                .build();
    }
}

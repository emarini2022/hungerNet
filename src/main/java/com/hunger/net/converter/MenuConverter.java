package com.hunger.net.converter;

import com.hunger.net.builder.MenuBuilder;
import com.hunger.net.builder.MenuDTOBuilder;
import com.hunger.net.dto.MenuDTO;
import com.hunger.net.entity.Menu;

public class MenuConverter implements AbstractConverter <Menu, MenuDTO> {

    @Override
    public Menu toEntity (MenuDTO menuDTO) {
        return new MenuBuilder()
                .withId(menuDTO.getId())
                .withContent(menuDTO.getContent())
                .withPrice(menuDTO.getPrice())
                .withTitle(menuDTO.getTitle())
                .build();
    }

    @Override
    public MenuDTO toDto (Menu menu) {
        return new MenuDTOBuilder()
                .withId(menu.getId())
                .withContent(menu.getContent())
                .withPrice(menu.getPrice())
                .withTitle(menu.getTitle())
                .build();
    }
}

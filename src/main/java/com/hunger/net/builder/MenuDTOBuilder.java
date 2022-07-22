package com.hunger.net.builder;

import com.hunger.net.dto.MenuDTO;
import com.sun.istack.Builder;

public class MenuDTOBuilder implements Builder<MenuDTO> {

    private MenuDTO menuDTO = new MenuDTO();

    public MenuDTOBuilder withId (Integer id){
        menuDTO.setId(id);
        return this;
    }
    public MenuDTOBuilder withTitle (String title){
        menuDTO.setTitle(title);
        return this;
    }
    public MenuDTOBuilder withContent (String content){
        menuDTO.setContent(content);
        return this;
    }
    public MenuDTOBuilder withPrice (Double price){
        menuDTO.setPrice(price);
        return this;
    }

    @Override
    public MenuDTO build() {
        return menuDTO;
    }
}

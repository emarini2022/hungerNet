package com.hunger.net.builder;

import com.hunger.net.io.entity.MenuEntity;
import com.sun.istack.Builder;

public class MenuBuilder implements Builder<MenuEntity> {

    private MenuEntity menuEntity = new MenuEntity();

    public MenuBuilder withId (Integer id){
        menuEntity.setId(id);
        return this;
    }
    public MenuBuilder withTitle (String title){
        menuEntity.setTitle(title);
        return this;
    }
    public MenuBuilder withContent (String content){
        menuEntity.setContent(content);
        return this;
    }
    public MenuBuilder withPrice (Double price){
        menuEntity.setPrice(price);
        return this;
    }

    @Override
    public MenuEntity build() {
        return menuEntity;
    }
}

package com.hunger.net.builder;

import com.hunger.net.entity.Menu;
import com.sun.istack.Builder;

public class MenuBuilder implements Builder<Menu> {

    private Menu menu = new Menu();

    public MenuBuilder withId (Integer id){
        menu.setId(id);
        return this;
    }
    public MenuBuilder withTitle (String title){
        menu.setTitle(title);
        return this;
    }
    public MenuBuilder withContent (String content){
        menu.setContent(content);
        return this;
    }
    public MenuBuilder withPrice (Double price){
        menu.setPrice(price);
        return this;
    }

    @Override
    public Menu build() {
        return menu;
    }
}

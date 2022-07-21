package com.hunger.net.service;

import com.hunger.net.dto.MenuDto;

import java.util.List;

public interface MenuService {

    MenuDto createMenu (MenuDto menuDto);

    List<MenuDto> getAllMenu ();
}

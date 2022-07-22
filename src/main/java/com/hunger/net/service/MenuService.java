package com.hunger.net.service;

import com.hunger.net.dto.MenuDTO;

import java.util.List;

public interface MenuService {

    MenuDTO createMenu (MenuDTO menuDto);

    List<MenuDTO> getAllMenu ();
}

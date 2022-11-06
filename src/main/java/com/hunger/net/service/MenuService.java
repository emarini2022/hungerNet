package com.hunger.net.service;

import com.hunger.net.dto.MenuDTO;

import java.util.List;

public interface MenuService {

    MenuDTO createMenu (MenuDTO menuDto);
    MenuDTO getMenuById(String menuID);
    MenuDTO updateMenuDetails(String menuID, MenuDTO menuDTO);

    void deleteMenu (String id);

    List<MenuDTO> getAllMenu ();

    MenuDTO makeOrder (MenuDTO orderDTO);
}

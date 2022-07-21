package com.hunger.net.service.impl;

import com.hunger.net.dto.MenuDto;
import com.hunger.net.entity.Menu;
import com.hunger.net.repository.MenuRepository;
import com.hunger.net.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MenuServiceImpl implements MenuService {

    private MenuRepository menuRepository;


    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public MenuDto createMenu(MenuDto menuDto) {

        //convert DTO to Entity

        Menu menu = new Menu();
        menu.setId(menuDto.getId());
        menu.setTitle(menuDto.getTitle());
        menu.setContent(menuDto.getContent());


        Menu newMenu = menuRepository.save(menu);

        //convert Entity to DTO
        MenuDto menuResponse = new MenuDto();
        menuResponse.setId(newMenu.getId());
        menuResponse.setTitle(newMenu.getTitle());
        menuResponse.setContent(newMenu.getContent());

        return menuResponse;
    }
}

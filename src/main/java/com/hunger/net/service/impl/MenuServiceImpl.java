package com.hunger.net.service.impl;

import com.hunger.net.dto.MenuDto;
import com.hunger.net.entity.Menu;
import com.hunger.net.repository.MenuRepository;
import com.hunger.net.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class MenuServiceImpl implements MenuService {

    private MenuRepository menuRepository;


    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public MenuDto createMenu(MenuDto menuDto) {

        //convert DTO to Entity
        Menu menu = mapToEntity(menuDto);

        Menu newItem = menuRepository.save(menu);

        //convert Entity to DTO
        MenuDto menuUpdated = mapToDto(newItem);

        return menuUpdated;
    }


    @Override
    public List<MenuDto> getAllMenu() {

        List <Menu> menus = menuRepository.findAll();

        return menus.stream().map(menu -> mapToDto(menu)).collect(Collectors.toList());
    }

    //convert Entity to DTO   "Krijo builder"

    private MenuDto mapToDto (Menu menu){

        MenuDto menuDto = new MenuDto();
        menuDto.setId(menu.getId());
        menuDto.setTitle(menu.getTitle());
        menuDto.setContent(menu.getContent());

        return menuDto;
    }

    //convert DTO to Entity     "Krijo builder"
    private Menu mapToEntity (MenuDto menuDto){
        Menu menu = new Menu();

        menu.setId(menuDto.getId());
        menu.setTitle(menuDto.getTitle());
        menu.setContent(menuDto.getContent());

        return menu;
    }
}

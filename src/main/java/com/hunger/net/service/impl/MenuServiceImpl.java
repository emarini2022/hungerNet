package com.hunger.net.service.impl;

import com.hunger.net.dto.MenuDTO;
import com.hunger.net.entity.Menu;
import com.hunger.net.repository.MenuRepository;
import com.hunger.net.service.MenuService;
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
    public MenuDTO createMenu(MenuDTO menuDto) {

        //convert DTO to Entity
        Menu menu = mapToEntity(menuDto);

        Menu newItem = menuRepository.save(menu);

        //convert Entity to DTO
        MenuDTO menuUpdated = mapToDto(newItem);

        return menuUpdated;
    }


    @Override
    public List<MenuDTO> getAllMenu() {

        List <Menu> menus = menuRepository.findAll();

        return menus.stream().map(menu -> mapToDto(menu)).collect(Collectors.toList());
    }

    //convert Entity to DTO   "Krijo builder"

    private MenuDTO mapToDto (Menu menu){

        MenuDTO menuDto = new MenuDTO();
        menuDto.setId(menu.getId());
        menuDto.setTitle(menu.getTitle());
        menuDto.setContent(menu.getContent());

        return menuDto;
    }

    //convert DTO to Entity     "Krijo builder"
    private Menu mapToEntity (MenuDTO menuDto){
        Menu menu = new Menu();

        menu.setId(menuDto.getId());
        menu.setTitle(menuDto.getTitle());
        menu.setContent(menuDto.getContent());

        return menu;
    }
}

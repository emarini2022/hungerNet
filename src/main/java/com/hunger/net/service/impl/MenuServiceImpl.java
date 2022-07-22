package com.hunger.net.service.impl;

import com.hunger.net.converter.AbstractConverter;
import com.hunger.net.converter.MenuConverter;
import com.hunger.net.dto.MenuDTO;
import com.hunger.net.entity.Menu;
import com.hunger.net.repository.MenuRepository;
import com.hunger.net.service.MenuService;
import org.hibernate.boot.model.convert.internal.AbstractConverterDescriptor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;
    private final AbstractConverter<Menu, MenuDTO> menuConverter;


    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
        this.menuConverter = new MenuConverter();
    }

    @Override
    public MenuDTO createMenu(MenuDTO menuDto) {

        //convert DTO to Entity
        Menu menu = new Menu();

        Menu newItem = menuRepository.save(menu);

        //convert Entity to DTO
        MenuDTO menuUpdated = menuConverter.toDto(newItem);

        return menuUpdated;
    }


    @Override
    public List<MenuDTO> getAllMenu() {
        List <Menu> menus = menuRepository.findAll();
        return menus.stream().map(menuConverter::toDto).collect(Collectors.toList());
    }

    @Override
    public MenuDTO makeOrder(MenuDTO orderDTO) {

        return null;
    }
}

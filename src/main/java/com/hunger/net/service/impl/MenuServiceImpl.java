package com.hunger.net.service.impl;

import antlr.Utils;

import com.hunger.net.dto.MenuDTO;
import com.hunger.net.io.entity.MenuEntity;
import com.hunger.net.io.repository.MenuRepository;
import com.hunger.net.service.MenuService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuRepository menuRepository;


    @Override
    public MenuDTO createMenu(MenuDTO menuDto) {

        ModelMapper modelMapper=new ModelMapper();

        MenuEntity menuEntity = modelMapper.map(menuDto, MenuEntity.class);
        MenuEntity storeMenu = menuRepository.save(menuEntity);

        MenuDTO menuDTO = new MenuDTO();

        menuDTO=modelMapper.map(storeMenu, MenuDTO.class);

        return menuDTO;
    }

    @Override
    public MenuDTO getMenuById(String menuID) {
        MenuDTO returnValue = new MenuDTO();

        ModelMapper modelMapper = new ModelMapper();

        MenuEntity menuEntity = menuRepository.findByMenuID(menuID);

        returnValue=modelMapper.map(menuEntity, MenuDTO.class);

        return returnValue;
    }

    @Override
    public MenuDTO updateMenuDetails(String menuID, MenuDTO menuDTO) {
        return null;
    }

    @Override
    public void deleteMenu(String menuId) {

        MenuEntity menuEntity = new MenuEntity();

        menuRepository.findByMenuID(menuId);

        menuRepository.delete(menuEntity);
    }


    @Override
    public List<MenuDTO> getAllMenu() {

        List <MenuDTO> returnValue = new ArrayList<>();

        Iterable <MenuEntity> iterableObjects=menuRepository.findAll();

        for (MenuEntity menuEntity : iterableObjects){
            MenuDTO menuDTO=new MenuDTO();
            returnValue.add(menuDTO);
        }
        return returnValue;
    }

    @Override
    public MenuDTO makeOrder(MenuDTO orderDTO) {

        return null;
    }
}

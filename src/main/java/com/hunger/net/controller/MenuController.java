package com.hunger.net.controller;

import com.hunger.net.dto.MenuDTO;
import com.hunger.net.model.response.MenuDetailsResponse;
import com.hunger.net.service.MenuService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {


    @Autowired
    MenuService menuService;

    @GetMapping(path = "/{id}")
    public MenuDetailsResponse getMenu(@PathVariable String id){

        MenuDetailsResponse returnValue = new MenuDetailsResponse();
        ModelMapper modelMapper = new ModelMapper();

        MenuDTO menuDTO = menuService.getMenuById(id);
        returnValue = modelMapper.map(menuDTO, MenuDetailsResponse.class);

        return returnValue;
    }


    @PostMapping
    public MenuDetailsResponse createMenu(@RequestBody MenuDetailsResponse menuDetailsResponse){

        MenuDetailsResponse returnValue = new MenuDetailsResponse();
        ModelMapper modelMapper = new ModelMapper();

        MenuDTO menuDTO = modelMapper.map(menuDetailsResponse, MenuDTO.class);
        MenuDTO createFood= menuService.createMenu(menuDTO);

        returnValue = modelMapper.map(createFood, MenuDetailsResponse.class);

        return returnValue;
    }

    // get all menus

    @GetMapping
    public List <MenuDetailsResponse> getAllMenus (){

        List <MenuDetailsResponse> returnValue = new ArrayList<>();

        List<MenuDTO> menuDTOList = menuService.getAllMenu();

        for (MenuDTO menuDTO:menuDTOList){
            MenuDetailsResponse response = new MenuDetailsResponse();
            returnValue.add(response);
        }

      return returnValue;
    }

}

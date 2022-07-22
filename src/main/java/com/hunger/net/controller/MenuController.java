package com.hunger.net.controller;

import com.hunger.net.dto.MenuDTO;
import com.hunger.net.service.MenuService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    // create a menu

    @PostMapping
    public ResponseEntity<MenuDTO> createMenu(@RequestBody MenuDTO menuDto){

        return new ResponseEntity<>(menuService.createMenu(menuDto), HttpStatus.CREATED);
    }

    // get all menus

    @GetMapping
    public List <MenuDTO> getAllMenus (){

      return menuService.getAllMenu();
    }
}

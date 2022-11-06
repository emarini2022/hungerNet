package com.hunger.net.io.repository;

import com.hunger.net.io.entity.MenuEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends CrudRepository<MenuEntity, Integer> {

    MenuEntity findByMenuID(String menuId);

}

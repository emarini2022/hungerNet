package com.hunger.net.service;

import com.hunger.net.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO createUser (UserDTO user);
    UserDTO getUserbyId (String UserId);
    UserDTO updateUser (String userId, UserDTO user);

    void deleteUser (String userId);

    List<UserDTO>getUsers();
}

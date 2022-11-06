package com.hunger.net.service.impl;

import com.hunger.net.dto.UserDTO;
import com.hunger.net.exception.ResourceNotFoundException;
import com.hunger.net.io.entity.UserEntity;
import com.hunger.net.io.repository.UserRepository;
import com.hunger.net.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO user) {

        UserEntity userEntity =new UserEntity();

        UserEntity storeUser = userRepository.save(userEntity);

        UserDTO returnValue = new UserDTO();

        return returnValue;
    }

    @Override
    public UserDTO getUserbyId(String UserId) throws ResourceNotFoundException {

        UserEntity userEntity = userRepository.findbyUserID(UserId);
        UserDTO returnValue = new UserDTO();

        return returnValue;
    }

    @Override
    public UserDTO updateUser(String userId, UserDTO user) {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public List<UserDTO> getUsers() {
        return null;
    }
}

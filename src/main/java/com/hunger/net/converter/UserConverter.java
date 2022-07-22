package com.hunger.net.converter;

import com.hunger.net.builder.UserBuilder;
import com.hunger.net.builder.UserDTOBuilder;
import com.hunger.net.dto.UserDTO;
import com.hunger.net.entity.User;

public class UserConverter implements AbstractConverter<User, UserDTO> {


    @Override
    public User toEntity(UserDTO userDTO) {
        return new UserBuilder()
                .withId(userDTO.getId())
                .withName(userDTO.getName())
                .withSurname(userDTO.getSurname())
                .withEmail(userDTO.getEmail())
                .withPhoneNumber(userDTO.getPhoneNumber())
                .withUserRole(userDTO.getUserRole())
                .build();
    }

    @Override
    public UserDTO toDto(User user) {
        return new UserDTOBuilder()
                .withId(user.getId())
                .withName(user.getName())
                .withSurname(user.getSurname())
                .withEmail(user.getEmail())
                .withPhoneNumber(user.getPhoneNumber())
                .withUserRole(user.getUserRole())
                .build();
    }
}

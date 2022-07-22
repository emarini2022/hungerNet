package com.hunger.net.builder;

import com.hunger.net.dto.UserDTO;
import com.hunger.net.enums.RoleEnum;
import com.sun.istack.Builder;

public class UserDTOBuilder implements Builder<UserDTO> {

    private UserDTO userDTO = new UserDTO();

    public UserDTOBuilder withId (Integer id){
        userDTO.setId(id);
        return this;
    }
    public UserDTOBuilder withName (String name){
        userDTO.setName(name);
        return this;
    }

    public UserDTOBuilder withSurname (String surname){
        userDTO.setSurname(surname);
        return this;
    }

    public UserDTOBuilder withPhoneNumber (String phoneNumber){
        userDTO.setPhoneNumber(phoneNumber);
        return this;
    }

    public UserDTOBuilder withEmail (String email){
        userDTO.setEmail(email);
        return this;
    }

    public UserDTOBuilder withUserRole (RoleEnum userRole){
        userDTO.setUserRole(userRole);
        return this;
    }


    @Override
    public UserDTO build() {
        return userDTO;
    }
}

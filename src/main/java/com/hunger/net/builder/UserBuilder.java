package com.hunger.net.builder;

import com.hunger.net.entity.User;
import com.hunger.net.enums.RoleEnum;
import com.sun.istack.Builder;

public class UserBuilder implements Builder <User> {


    private User user = new User();

    public UserBuilder withId (Integer id){
        user.setId(id);
        return this;
    }
    public UserBuilder withName (String name){
        user.setName(name);
        return this;
    }

    public UserBuilder withSurname (String surname){
        user.setSurname(surname);
        return this;
    }

    public UserBuilder withPhoneNumber (String phoneNumber){
        user.setPhoneNumber(phoneNumber);
        return this;
    }

    public UserBuilder withEmail (String email){
        user.setEmail(email);
        return this;
    }

    public UserBuilder withUserRole (RoleEnum userRole){
        user.setUserRole(userRole);
        return this;
    }




    @Override
    public User build() {
        return user;
    }
}

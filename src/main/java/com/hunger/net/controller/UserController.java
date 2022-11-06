package com.hunger.net.controller;

import com.hunger.net.dto.UserDTO;
import com.hunger.net.model.request.UserDetailRequestModel;
import com.hunger.net.model.response.UserDetailsResponse;
import com.hunger.net.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

@GetMapping (path = "/{id}")


    public UserDetailsResponse getUsers (@PathVariable String id){

    UserDetailsResponse returnValue = new UserDetailsResponse();

    UserDTO userDTO = userService.getUserbyId(id);

    return returnValue;
}
/**
@PutMapping (path = "/{id}") {

    public UserDetailsResponse updateUser (@PathVariable String id, UserDetailRequestModel userDetails ){

        UserDetailsResponse returnValue = new UserDetailsResponse();

        UserDTO userDTO = new UserDTO();

        UserDTO updateUser=userService.updateUser(id, userDTO);

        return returnValue;
    }
*/


@GetMapping
    public List<UserDetailsResponse> getAllUsers(){

    List <UserDetailsResponse> returnValue = new ArrayList<>();

    List<UserDTO> users = userService.getUsers();

    for (UserDTO userDTO:users){

        UserDetailsResponse userModel = new UserDetailsResponse();
        returnValue.add(userModel);
    }

return returnValue;}

}

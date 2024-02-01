package com.simplequiz.service;

import com.simplequiz.builder.UserBuilder;
import com.simplequiz.dto.UserDTO;
import com.simplequiz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserService {
    @Autowired
    private UserBuilder userBuilder;

    public UserDTO findUserById(Long id){
        ArrayList<User> userList = StaticDataBaseOnlyForTests.staticUserDataBase();
        for (User userModel: userList){
            if (userModel.getId().equals(id)){
                UserDTO userDTO = userBuilder.toDTO(userModel);
                return userDTO;
            }
        }
        return null;
    }
}

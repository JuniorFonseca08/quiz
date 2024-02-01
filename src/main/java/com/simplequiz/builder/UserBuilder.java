package com.simplequiz.builder;

import com.simplequiz.dto.PlayerDTO;
import com.simplequiz.dto.QuestionAlternativeDTO;
import com.simplequiz.dto.QuestionDTO;
import com.simplequiz.dto.UserDTO;
import com.simplequiz.model.Player;
import com.simplequiz.model.Question;
import com.simplequiz.model.QuestionAlternative;
import com.simplequiz.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserBuilder {

    private final ModelMapper modelMapper;

    public UserBuilder(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UserDTO toDTO (User user){
        return this.modelMapper.map(user, UserDTO.class);
    }

    public User toEntity (UserDTO userDTO){
        return this.modelMapper.map(userDTO, User.class);
    }

}

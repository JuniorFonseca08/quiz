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
public class PlayerBuilder {

    private final ModelMapper modelMapper;

    public PlayerBuilder(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PlayerDTO toDTO (Player player){
        return this.modelMapper.map(player, PlayerDTO.class);
    }

    // Fiz mas nao sei se esta correto.
    public Player toEntity (PlayerDTO playerDTO) {
        return this.modelMapper.map(playerDTO, Player.class);
    }

    public QuestionAlternativeDTO toDTO (QuestionAlternative questionAlternative){
        return this.modelMapper.map(questionAlternative, QuestionAlternativeDTO.class);
    }
    public QuestionAlternative toEntity (QuestionAlternativeDTO questionAlternativeDTO){
        return this.modelMapper.map(questionAlternativeDTO, QuestionAlternative.class);
    }

    public QuestionDTO toDTO (Question question){
        return this.modelMapper.map(question, QuestionDTO.class);
    }

    public Question toEntity (QuestionDTO questionDTO){
        return this.modelMapper.map(questionDTO, Question.class);
    }
    public UserDTO toDTO (User user){
        return this.modelMapper.map(user, UserDTO.class);
    }

    public User toEntity (UserDTO userDTO){
        return this.modelMapper.map(userDTO, User.class);
    }

}

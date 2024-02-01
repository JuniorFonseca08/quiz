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
public class QuestionBuilder {

    private final ModelMapper modelMapper;

    public QuestionBuilder(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public QuestionDTO toDTO (Question question){
        return this.modelMapper.map(question, QuestionDTO.class);
    }

    public Question toEntity (QuestionDTO questionDTO){
        return this.modelMapper.map(questionDTO, Question.class);
    }

}

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
public class QuestionAlternativeBuilder {

    private final ModelMapper modelMapper;

    public QuestionAlternativeBuilder(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public QuestionAlternativeDTO toDTO (QuestionAlternative questionAlternative){
        return this.modelMapper.map(questionAlternative, QuestionAlternativeDTO.class);
    }
    public QuestionAlternative toEntity (QuestionAlternativeDTO questionAlternativeDTO){
        return this.modelMapper.map(questionAlternativeDTO, QuestionAlternative.class);
    }


}

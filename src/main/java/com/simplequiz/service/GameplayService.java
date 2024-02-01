package com.simplequiz.service;

import com.simplequiz.builder.PlayerBuilder;
import com.simplequiz.dto.PlayerDTO;
import com.simplequiz.model.Player;
import com.simplequiz.model.Question;
import com.simplequiz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GameplayService {
    @Autowired
    private QuizDataBaseService quizDataBaseService;
    @Autowired
    private PlayerBuilder playerBuilder;

    public PlayerDTO startQuizGameplay(String nickName, String theme, User user){
        PlayerDTO playerDTO = new PlayerDTO(nickName, 0, user);

        ArrayList<Question> questionsList = quizDataBaseService.showAllQuestions();
        ArrayList<Question> filteredQuestionsList = quizDataBaseService.findByTheme(questionsList, playerDTO.getTheme());

        playerDTO.setPlayerQuestionsList(filteredQuestionsList);

        return playerDTO;
    }

    public PlayerDTO findPlayerById(Long id){
        User user = new User("name", "fullNamee", 30);
        Player playerModel = new Player("nickName", 900, user);

       return playerBuilder.toDTO(playerModel);
    }

}

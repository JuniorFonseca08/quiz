package com.simplequiz.service;

import com.simplequiz.model.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class QuizDataBaseService {

    public ArrayList<Question> showAllQuestions(){
        ArrayList<Question> questionsList = new ArrayList<>();

        questionsList = StaticDataBaseOnlyForTests.staticDataBaseWithHardcode();

        return questionsList;
    }

    public ArrayList<Question> findByTheme(ArrayList<Question> allQuestions, String theme){
        ArrayList<Question> filteredQuestionsList = new ArrayList<>();

        for (Question question : allQuestions){
            if (question.getTheme().equalsIgnoreCase(theme)){
                filteredQuestionsList.add(question);
            }
        }
        return filteredQuestionsList;
    }
}

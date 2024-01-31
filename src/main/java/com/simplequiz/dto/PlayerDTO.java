package com.simplequiz.dto;

import com.simplequiz.model.Question;
import com.simplequiz.model.User;

import java.util.ArrayList;

public class PlayerDTO {

    private Long id;
    private String nickName;
    private Integer score;
    private User user;
    private String theme;
    private ArrayList<Question> PlayerQuestionsList;

    public PlayerDTO(){

    }

    public PlayerDTO(String nickName, Integer score, String theme,User user) {
        this.nickName = nickName;
        this.score = score;
        this.theme = theme;
        this.user = user;
    }

    public PlayerDTO(String nickName, Integer score, User user) {
        this.nickName = nickName;
        this.score = score;
        this.user = user;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public ArrayList<Question> getPlayerQuestionsList() {
        return PlayerQuestionsList;
    }

    public void setPlayerQuestionsList(ArrayList<Question> playerQuestionsList) {
        PlayerQuestionsList = playerQuestionsList;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "\nId=" + id +
                "\nNickName='" + nickName + '\'' +
                "\nScore=" + score +
                "\nUser=" + user +
                "\nTheme='" + theme + '\'' +
                '}';
    }
}

package com.simplequiz.model;

public class Player {

    private Long id;
    private String nickName;
    private Integer score;
    private User user;

    public Player(){

    }

    public Player(String nickName, int score, User user) {
        this.nickName = nickName;
        this.score = score;
        this.user = user;
    }

    public Player(Long id, String nickName, Integer score, User user) {
        this.id = id;
        this.nickName = nickName;
        this.score = score;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setScore(Integer score) {
        this.score = score;
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

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", score=" + score +
                ", user=" + user +
                '}';
    }
}

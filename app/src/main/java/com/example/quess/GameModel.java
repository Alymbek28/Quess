package com.example.quess;

import java.io.Serializable;

public class GameModel implements Serializable {

    public String firstImage, secondImage, thirdImage, fourImage, answer, level;

    public GameModel(String firstImage, String secondImage, String thirdImage, String fourImage, String answer, String level) {
        this.firstImage = firstImage;
        this.secondImage = secondImage;
        this.thirdImage = thirdImage;
        this.fourImage = fourImage;
        this.answer = answer;
        this.level = level;

    }

}
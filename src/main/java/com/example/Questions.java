package com.example;

public class Questions{
    private int  questionId ;
    private String defisId;
    private String description;
    private int  points;
    private String secret ;

    public int getQuestionId() {
        return questionId;
    }

    public String getDefisId() {
        return defisId;
    }
     public String getDescription() {
        return description;
    }

    public int getPoints() {
        return points;
    }

    public String getSecret() {
        return secret;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setDefisId(String defisId) {
        this.defisId = defisId;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
    
    
    
}

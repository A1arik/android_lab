package com.example.mytest;

import java.util.List;

public class Question {
    private int Id;
    private String question;
    private int correctAnswer;
    private List<String> answers;


    public Question(int id, String question, int correctAnswer, List<String> answers){
        this.Id=id;
        this.question=question;
        this.correctAnswer=correctAnswer;
        this.answers = answers;
    }
    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getCorrectAnswer() {
        return this.correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAnswers() {
        return this.answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

}

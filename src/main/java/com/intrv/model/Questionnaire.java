package com.intrv.model;

public class Questionnaire {

    private String tutorId;

    private Answer answer;

    public Questionnaire() {
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }
}

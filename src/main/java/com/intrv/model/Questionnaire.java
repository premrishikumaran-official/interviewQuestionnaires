package com.intrv.model;

import java.util.List;

public class Questionnaire {

    List<Answer> answers;

    public Questionnaire() {
    }

    public Questionnaire(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}

package com.intrv.util;

import com.intrv.model.Question;
import com.intrv.model.multichoice.AfterSchoolClub;
import com.intrv.model.multichoice.HomeSchooling;
import com.intrv.model.multichoice.OnlineTutoring;
import com.intrv.model.singlechoice.TutoringYears;

import java.util.Arrays;
import java.util.Optional;

public enum QuestionMapper {


    AfterSchoolClub("1a",  new AfterSchoolClub()),
    HomeSchooling("1b", new HomeSchooling()),
    OnlineTutoring("1c",  new OnlineTutoring()),
    TutoringYears("2", new TutoringYears());

    private final String id;
    private final Question question;

    QuestionMapper(String id, Question question) {

        this.id = id;
        this.question = question;
    }

    public String getId() {
        return id;
    }

    public Question getQuestion() {
        return question;
    }


    public static Optional<Question> findByQuestionIdAndSetValue(String id,int value) {
        Optional<Question> question =  Arrays.stream(QuestionMapper.values())
                .filter(v->v.getId().equals(id))
                .map(QuestionMapper::getQuestion)
                .findFirst();
        question.ifPresent(question1 -> question1.setValue(value));
        return question;

    }
}

package com.intrv.util;

import com.intrv.helper.MultiChoiceHelper;
import com.intrv.helper.ScoreHelper;
import com.intrv.helper.TutoringYearsHelper;

import java.util.Arrays;
import java.util.Optional;

public enum QuestionMapper {


    AfterSchoolClub("Q1a",  new MultiChoiceHelper()),
    HomeSchooling("Q1b", new MultiChoiceHelper()),
    OnlineTutoring("Q1c",  new MultiChoiceHelper()),
    TutoringYears("Q2", new TutoringYearsHelper());

    private final String id;
    private final ScoreHelper scoreHelper;


    QuestionMapper(String id, ScoreHelper scoreHelper) {

        this.id = id;
        this.scoreHelper = scoreHelper;
    }

    public String getId() {
        return id;
    }


    public ScoreHelper getScoreHelper() {
        return scoreHelper;
    }

    public static Optional<ScoreHelper> findByTypeId(String id,int value) {

        return Arrays.stream(QuestionMapper.values())
                .filter(v->v.getId().equals(id))
                .map(QuestionMapper::getScoreHelper)
                .map(sh->sh.setValue(value))
                .findFirst();

    }
}

package com.intrv.util;

import com.intrv.helper.MultiChoiceScoreHelper;
import com.intrv.helper.ScoreHelper;
import com.intrv.helper.TutoringYearsScoreHelper;

import java.util.Arrays;
import java.util.Optional;

public enum AnswerToScoreMapper {


    AfterSchoolClub("Q1a",  new MultiChoiceScoreHelper()),
    HomeSchooling("Q1b", new MultiChoiceScoreHelper()),
    OnlineTutoring("Q1c",  new MultiChoiceScoreHelper()),
    TutoringYears("Q2", new TutoringYearsScoreHelper());

    private final String id;
    private final ScoreHelper scoreHelper;


    AnswerToScoreMapper(String id, ScoreHelper scoreHelper) {

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

        return Arrays.stream(AnswerToScoreMapper.values())
                .filter(v->v.getId().equals(id))
                .map(AnswerToScoreMapper::getScoreHelper)
                .map(sh->sh.setValue(value))
                .findFirst();

    }
}

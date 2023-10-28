package com.intrv.util;

import com.intrv.helper.ScoreHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TutorScoring {


    private static int calculateScore(List<ScoreHelper> choiceAnswers) {

        return choiceAnswers
                .stream()
                .map(ScoreHelper::calculateScore)
                .reduce(0, Integer::sum);
    }

    public static int getTotalScore(List<ScoreHelper> multipleChoiceAnswers,
                                    List<ScoreHelper> singleChoiceAnswers) {

        List<ScoreHelper> multipleChoiceAns =
                Optional.ofNullable(multipleChoiceAnswers).orElseGet(ArrayList::new);

        List<ScoreHelper> singleChoiceAns =
                Optional.ofNullable(singleChoiceAnswers).orElseGet(ArrayList::new);

        return calculateScore(multipleChoiceAns)
                + calculateScore(singleChoiceAns);
    }
}

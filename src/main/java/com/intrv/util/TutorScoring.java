package com.intrv.util;

import com.intrv.model.multichoice.SelectedChoice;
import com.intrv.model.singlechoice.SingleChoiceAnswer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TutorScoring {

    private static int calculateMultipleChoiceScore(List<SelectedChoice> multipleChoiceAnswers) {
        return multipleChoiceAnswers
                .stream()
                .filter(SelectedChoice::isSelected)
                .map(eachSelectedchoice -> 1)
                .reduce(0, Integer::sum);
    }

    private static int calculateSingleChoiceScore(List<SingleChoiceAnswer> singleChoiceAnswers) {
        return singleChoiceAnswers
                .stream()
                .map(SingleChoiceAnswer::getScore)
                .reduce(0, Integer::sum);
    }

    public static int getTotalScore(List<SelectedChoice> multipleChoiceAnswers,
                                    List<SingleChoiceAnswer> singleChoiceAnswers) {

        List<SelectedChoice> multipleChoiceAns =
                Optional.ofNullable(multipleChoiceAnswers).orElseGet(ArrayList::new);

        List<SingleChoiceAnswer> singleChoiceAns =
                Optional.ofNullable(singleChoiceAnswers).orElseGet(ArrayList::new);

        return calculateMultipleChoiceScore(multipleChoiceAns)
                + calculateSingleChoiceScore(singleChoiceAns);
    }
}

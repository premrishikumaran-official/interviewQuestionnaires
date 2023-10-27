package com.intrv;



import com.intrv.multichoice.SelectedChoice;
import com.intrv.singlechoice.SingleChoiceAnswer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TutorScoring {
    private final String tutorId;
    private final List<SelectedChoice> multipleChoiceAnswers;
    private final List<SingleChoiceAnswer> singleChoiceAnswers;

    public TutorScoring(String tutorId, List<SelectedChoice> multipleChoiceAnswers,
                        List<SingleChoiceAnswer> singleChoiceAnswers) {
        this.tutorId = tutorId;
        this.multipleChoiceAnswers = Optional.ofNullable(multipleChoiceAnswers).orElseGet(ArrayList::new);
        this.singleChoiceAnswers = Optional.ofNullable(singleChoiceAnswers).orElseGet(ArrayList::new);
    }

    private int calculateMultipleChoiceScore() {
        return multipleChoiceAnswers
                .stream()
                .filter(SelectedChoice::isSelected)
                .map(eachSelectedchoice -> 1)
                .reduce(0, Integer::sum);
    }

    private int calculateSingleChoiceScore() {
        return singleChoiceAnswers
                .stream()
                .map(SingleChoiceAnswer::getScore)
                .reduce(0, Integer::sum);
    }


    public String getTutorId() {
        return tutorId;
    }

    public int getScore() {
        return calculateMultipleChoiceScore()
                + calculateSingleChoiceScore();
    }
}

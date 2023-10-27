package com.intrv.service;

import com.intrv.model.Answer;
import com.intrv.model.Questionnaire;
import com.intrv.model.multichoice.SelectedChoice;
import com.intrv.model.singlechoice.SingleChoiceAnswer;
import com.intrv.util.QuestionMapper;
import com.intrv.util.TutorScoring;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TutorServiceImpl implements TutorService {


    @Override
    public int calculateScore(Questionnaire questionnaire) {

        List<Answer> answers = questionnaire.getAnswers();

        if (answers == null || answers.isEmpty()) return 0;

        List<SelectedChoice> checkboxChoices = answers.stream()
                .filter(Answer::isMultiSelection)
                .map(a -> QuestionMapper.findByQuestionIdAndSetValue(a.getId(),0))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(SelectedChoice.class::cast)
                .collect(Collectors.toList());

        List<SingleChoiceAnswer> selectedChoices = answers.stream()
                .filter(a -> !a.isMultiSelection())
                .map(a -> QuestionMapper.findByQuestionIdAndSetValue(a.getId(),a.getValue()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(SingleChoiceAnswer.class::cast)
                .collect(Collectors.toList());

       return TutorScoring.getTotalScore(checkboxChoices, selectedChoices);

    }
}

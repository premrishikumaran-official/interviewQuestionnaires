package com.intrv.service;

import com.intrv.helper.ScoreHelper;
import com.intrv.model.Answer;
import com.intrv.model.Questionnaire;
import com.intrv.model.multichoice.MultiSelectionChoice;
import com.intrv.model.multichoice.MultipleCategory;
import com.intrv.model.singlechoice.SingleCategory;
import com.intrv.model.singlechoice.SingleSelection;
import com.intrv.util.AnswerToScoreMapper;
import com.intrv.util.TutorScoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TutorServiceImpl implements TutorService {


    @Override
    public int calculateScore(Questionnaire questionnaire) {

        Answer answer = questionnaire.getAnswer();
        MultipleCategory multipleCategory = answer.getMultipleCategory();
        SingleCategory singleCategory = answer.getSingleCategory();

        List<MultiSelectionChoice> multiSelectionChoices =
                        Optional.ofNullable(multipleCategory.getCheckboxes())
                                .orElseGet(ArrayList::new);

        List<SingleSelection> singleSelections =
                Optional.ofNullable(singleCategory.getSingleSelections())
                                                .orElseGet(ArrayList::new);

        List<ScoreHelper> multiScoreHelper = multiSelectionChoices.stream()
                .filter(MultiSelectionChoice::isSelected)
                .map(a -> AnswerToScoreMapper.findByTypeId(a.getType(),1))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        List<ScoreHelper> singleScoreHelper = singleSelections.stream()
                .filter(ss->ss.getValue()!=0)
                .map(a -> AnswerToScoreMapper.findByTypeId(a.getType(),a.getValue()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());


       return TutorScoring.getTotalScore(multiScoreHelper, singleScoreHelper);

    }
}

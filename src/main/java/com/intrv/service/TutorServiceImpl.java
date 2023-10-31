package com.intrv.service;


import com.intrv.model.MultipleSelect;
import com.intrv.model.SingleSelect;
import com.intrv.model.TutorQuestionnaire;

public class TutorServiceImpl implements TutorService {


    @Override
    public int calculateScore(TutorQuestionnaire questionnaire) {
        int totalScore = 0;
        MultipleSelect multipleSelect = questionnaire.getMultipleSelect();
        SingleSelect singleSelect = questionnaire.getSingleSelect();
        if (multipleSelect != null) {
            if (multipleSelect.getAfterSchoolClub() != null
                    && multipleSelect.getAfterSchoolClub().isSelected()) {
                totalScore += 1;
            }
            if (multipleSelect.getOnlineTutoring() != null
                    && multipleSelect.getOnlineTutoring().isSelected()) {
                totalScore += 1;
            }

            if (multipleSelect.getHomeSchooling() != null
                    && multipleSelect.getHomeSchooling().isSelected()) {
                totalScore += 1;
            }
        }
        if (singleSelect != null && singleSelect.getTutoringExperience() != null) {
            int years = singleSelect.getTutoringExperience().getYears();
            if (years == 2) {
                totalScore += 1;
            } else if (years >= 3) {
                totalScore += 2;
            }

        }

        return totalScore;
    }
}

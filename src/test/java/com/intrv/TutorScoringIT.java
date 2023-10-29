package com.intrv;


import com.intrv.helper.MultiChoiceScoreHelper;
import com.intrv.helper.ScoreHelper;
import com.intrv.helper.TutoringYearsScoreHelper;
import com.intrv.util.TutorScoring;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TutorScoringIT {


    @Test
    void WhenTutorScoring_HasAllChoiceAndYear3_thenCorrectScoreGenerated(){
        List<ScoreHelper> selectedChoices =
                List.of(new MultiChoiceScoreHelper().setValue(1),
                        new MultiChoiceScoreHelper().setValue(1),
                        new MultiChoiceScoreHelper().setValue(1));
        List<ScoreHelper> tutoringYears = List.of(new TutoringYearsScoreHelper().setValue(3));
        assertEquals(5,TutorScoring.getTotalScore(selectedChoices,tutoringYears));
    }

    @Test
    void WhenTutorScoring_HasAllChoiceAndYear2_thenCorrectScoreGenerated(){
        List<ScoreHelper> selectedChoices =
                List.of(new MultiChoiceScoreHelper().setValue(1),
                        new MultiChoiceScoreHelper().setValue(1),
                        new MultiChoiceScoreHelper().setValue(1));
        List<ScoreHelper> tutoringYears = List.of(new TutoringYearsScoreHelper().setValue(2));
        assertEquals(4,TutorScoring.getTotalScore(selectedChoices,tutoringYears));

    }


    @Test
    void WhenTutorScoring_HasAllChoiceAndYear1_thenCorrectScoreGenerated(){
        List<ScoreHelper> selectedChoices =
                List.of(new MultiChoiceScoreHelper().setValue(1),
                        new MultiChoiceScoreHelper().setValue(1),
                        new MultiChoiceScoreHelper().setValue(1));
        List<ScoreHelper> tutoringYears = List.of(new TutoringYearsScoreHelper().setValue(1));
        assertEquals(3,TutorScoring.getTotalScore(selectedChoices,tutoringYears));

    }



}

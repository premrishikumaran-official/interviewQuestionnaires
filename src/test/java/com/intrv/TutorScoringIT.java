package com.intrv;


import com.intrv.model.multichoice.AfterSchoolClub;
import com.intrv.model.multichoice.HomeSchooling;
import com.intrv.model.multichoice.OnlineTutoring;
import com.intrv.model.multichoice.SelectedChoice;
import com.intrv.model.singlechoice.SingleChoiceAnswer;
import com.intrv.model.singlechoice.TutoringYears;
import com.intrv.util.TutorScoring;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TutorScoringIT {

    @Test
    void WhenTutorScoring_HasAllChoiceAndYear3_thenCorrectScoreGenerated(){
        List<SelectedChoice> selectedChoices =
                List.of(new AfterSchoolClub(),new HomeSchooling(),new OnlineTutoring());
        List<SingleChoiceAnswer> tutoringYears
                                        = List.of(new TutoringYears(3));
        assertEquals(5,TutorScoring.getTotalScore(selectedChoices,tutoringYears));
    }

    @Test
    void WhenTutorScoring_HasAllChoiceAndYear2_thenCorrectScoreGenerated(){
        List<SelectedChoice> selectedChoices =
                List.of(new AfterSchoolClub(),new HomeSchooling(),new OnlineTutoring());
        List<SingleChoiceAnswer> tutoringYears
                = List.of(new TutoringYears(2));

        assertEquals(4,TutorScoring.getTotalScore(selectedChoices,tutoringYears));

    }


    @Test
    void WhenTutorScoring_HasAllChoiceAndYear1_thenCorrectScoreGenerated(){
        List<SelectedChoice> selectedChoices =
                List.of(new AfterSchoolClub(),new HomeSchooling(),new OnlineTutoring());
        List<SingleChoiceAnswer> tutoringYears
                = List.of(new TutoringYears(1));

        assertEquals(3,TutorScoring.getTotalScore(selectedChoices,tutoringYears));

    }


}

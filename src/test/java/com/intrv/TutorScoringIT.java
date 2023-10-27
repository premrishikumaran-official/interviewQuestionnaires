package com.intrv;


import com.intrv.multichoice.AfterSchoolClub;
import com.intrv.multichoice.HomeSchooling;
import com.intrv.multichoice.OnlineTutoring;
import com.intrv.multichoice.SelectedChoice;
import com.intrv.singlechoice.SingleChoiceAnswer;
import com.intrv.singlechoice.TutoringYears;
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

        TutorScoring tutorScoring =
                new TutorScoring("TUT01", selectedChoices,tutoringYears);

        assertEquals(5,tutorScoring.getScore());
        assertEquals("TUT01",tutorScoring.getTutorId());

    }

    @Test
    void WhenTutorScoring_HasAllChoiceAndYear2_thenCorrectScoreGenerated(){
        List<SelectedChoice> selectedChoices =
                List.of(new AfterSchoolClub(),new HomeSchooling(),new OnlineTutoring());
        List<SingleChoiceAnswer> tutoringYears
                = List.of(new TutoringYears(2));

        TutorScoring tutorScoring =
                new TutorScoring("TUT01", selectedChoices,tutoringYears);

        assertEquals(4,tutorScoring.getScore());
        assertEquals("TUT01",tutorScoring.getTutorId());

    }


    @Test
    void WhenTutorScoring_HasAllChoiceAndYear1_thenCorrectScoreGenerated(){
        List<SelectedChoice> selectedChoices =
                List.of(new AfterSchoolClub(),new HomeSchooling(),new OnlineTutoring());
        List<SingleChoiceAnswer> tutoringYears
                = List.of(new TutoringYears(1));

        TutorScoring tutorScoring =
                new TutorScoring("TUT01", selectedChoices,tutoringYears);

        assertEquals(3,tutorScoring.getScore());
        assertEquals("TUT01",tutorScoring.getTutorId());

    }


}

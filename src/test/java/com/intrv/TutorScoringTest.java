package com.intrv;

import com.intrv.multichoice.SelectedChoice;
import com.intrv.singlechoice.SingleChoiceAnswer;
import com.intrv.util.TestMultipleChoiceFactory;
import com.intrv.util.TestSingleChoiceFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TutorScoringTest {

    @Test
    void getTutorIdAndScore_WhenAllOtherInputIsNull() {
        TutorScoring tutorScoring =
                new TutorScoring("TUT01",null,null);
        assertEquals(0,tutorScoring.getScore());
        assertEquals("TUT01",tutorScoring.getTutorId());
    }


    @Test
    void getTutorIdAndScore_WhenEmpty() {
        TutorScoring tutorScoring =
                new TutorScoring("TUT01", List.of(),List.of());
        assertEquals(0,tutorScoring.getScore());
        assertEquals("TUT01",tutorScoring.getTutorId());
    }

    @Test
    void getTutorIdAndScore_WhenAllChoiceAreFilled() {
        List<SelectedChoice> mChoice = TestMultipleChoiceFactory.getSelectedChoiceAnswerList();
        List<SingleChoiceAnswer> sChoice = TestSingleChoiceFactory.getSingleChoiceAnswerList();

        TutorScoring tutorScoring =
                new TutorScoring("TUT01", mChoice,sChoice);
        assertEquals(5,tutorScoring.getScore());
        assertEquals("TUT01",tutorScoring.getTutorId());
    }


    @Test
    void getTutorIdAndScore_WhenOnlyMultipleChoiceQuestionsAreFilled() {
        List<SelectedChoice> mChoice = TestMultipleChoiceFactory.getSelectedChoiceAnswerList();
        TutorScoring tutorScoring =
                new TutorScoring("TUT01", mChoice,null);
        assertEquals(2,tutorScoring.getScore());
        assertEquals("TUT01",tutorScoring.getTutorId());
    }
    @Test
    void getTutorIdAndScore_WhenOnlySingleChoiceQuestionsAreFilled() {
        List<SingleChoiceAnswer> sChoice = TestSingleChoiceFactory.getSingleChoiceAnswerList();
        TutorScoring tutorScoring =
                new TutorScoring("TUT01", null,sChoice);
        assertEquals(3,tutorScoring.getScore());
        assertEquals("TUT01",tutorScoring.getTutorId());
    }

}
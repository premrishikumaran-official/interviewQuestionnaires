package com.intrv.util;

import com.intrv.helper.ScoreHelper;
import com.intrv.testUtil.TestMultipleChoiceFactory;
import com.intrv.testUtil.TestSingleChoiceFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TutorScoringTest {


    @Test
    void getTutorIdAndScore_WhenAllChoiceAreFilled() {
        List<ScoreHelper> mChoice = TestMultipleChoiceFactory.getSelectedChoiceAnswerList();
        List<ScoreHelper> sChoice = TestSingleChoiceFactory.getTutoringYears1();
        assertEquals(3,TutorScoring.getTotalScore(mChoice,sChoice));
    }

    @Test
    void getTutorIdAndScore_WhenAllMultiChoiceAreFilledWith2YearsTutoring() {
        List<ScoreHelper>  mChoice = TestMultipleChoiceFactory.getSelectedChoiceAnswerList();
        List<ScoreHelper> sChoice = TestSingleChoiceFactory.getTutoringYears2();
        assertEquals(4,TutorScoring.getTotalScore(mChoice,sChoice));
    }

    @Test
    void getTutorIdAndScore_WhenAllMultiChoiceAreFilledWith3YearsTutoring() {
        List<ScoreHelper> mChoice = TestMultipleChoiceFactory.getSelectedChoiceAnswerList();
        List<ScoreHelper> sChoice = TestSingleChoiceFactory.getTutoringYears3();
        assertEquals(5,TutorScoring.getTotalScore(mChoice,sChoice));
    }

    @Test
    void getTutorIdAndScore_WhenAllMultiChoiceAreFilledWith10YearsTutoring() {
        List<ScoreHelper> mChoice = TestMultipleChoiceFactory.getSelectedChoiceAnswerList();
        List<ScoreHelper> sChoice = TestSingleChoiceFactory.getTutoringYears10();
        assertEquals(5,TutorScoring.getTotalScore(mChoice,sChoice));
    }


    @Test
    void getTutorIdAndScore_WhenOnly2MultipleChoiceQuestionsFilledWith2YearsTutoring() {
        List<ScoreHelper> mChoice = TestMultipleChoiceFactory.getSelectedChoiceWithAfterSchoolAndHomeSchool();
        List<ScoreHelper> sChoice = TestSingleChoiceFactory.getTutoringYears2();
        assertEquals(3,TutorScoring.getTotalScore(mChoice,sChoice));
    }

}
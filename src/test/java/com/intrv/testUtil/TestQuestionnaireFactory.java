package com.intrv.testUtil;

import com.intrv.model.Answer;
import com.intrv.model.Questionnaire;

import java.util.List;

public class TestQuestionnaireFactory {

    public static Questionnaire getQuestHomeAfterSclOnlineTutor2YearTutoring() {
        Questionnaire questionnaire = new Questionnaire();

        Answer answer1 = new Answer();
        answer1.setId("1a"); //AfterSchoolClub
        answer1.setValue(0);
        answer1.setMultiSelection(true);

        Answer answer2 = new Answer();
        answer2.setId("1b"); //HomeSchooling
        answer2.setValue(0);
        answer2.setMultiSelection(true);

        Answer answer3 = new Answer();
        answer3.setId("1c"); //OnlineTutoring
        answer3.setValue(0);
        answer3.setMultiSelection(true);

        Answer answer4 = new Answer();
        answer4.setId("2"); //TutoringYears
        answer4.setValue(2);
        answer4.setMultiSelection(false);

        questionnaire.setAnswers(List.of(answer1,answer2,answer3,answer4));

        return questionnaire;
    }


    public static Questionnaire getQuestHomeAfterSclOnlineTutor3YearTutoring() {
        Questionnaire questionnaire = new Questionnaire();

        Answer answer1 = new Answer();
        answer1.setId("1a"); //AfterSchoolClub
        answer1.setValue(0);
        answer1.setMultiSelection(true);

        Answer answer2 = new Answer();
        answer2.setId("1b"); //HomeSchooling
        answer2.setValue(0);
        answer2.setMultiSelection(true);

        Answer answer3 = new Answer();
        answer3.setId("1c"); //OnlineTutoring
        answer3.setValue(0);
        answer3.setMultiSelection(true);

        Answer answer4 = new Answer();
        answer4.setId("2"); //TutoringYears
        answer4.setValue(3);
        answer4.setMultiSelection(false);

        questionnaire.setAnswers(List.of(answer1,answer2,answer3,answer4));

        return questionnaire;
    }

    public static Questionnaire getQuestHomeAfterSclOnlineTutor10YearTutoring() {
        Questionnaire questionnaire = new Questionnaire();

        Answer answer1 = new Answer();
        answer1.setId("1a"); //AfterSchoolClub
        answer1.setValue(0);
        answer1.setMultiSelection(true);

        Answer answer2 = new Answer();
        answer2.setId("1b"); //HomeSchooling
        answer2.setValue(0);
        answer2.setMultiSelection(true);

        Answer answer3 = new Answer();
        answer3.setId("1c"); //OnlineTutoring
        answer3.setValue(0);
        answer3.setMultiSelection(true);

        Answer answer4 = new Answer();
        answer4.setId("2"); //TutoringYears
        answer4.setValue(10);
        answer4.setMultiSelection(false);

        questionnaire.setAnswers(List.of(answer1,answer2,answer3,answer4));

        return questionnaire;
    }

    public static Questionnaire getOnlyTutor10YearTutoring() {
        Questionnaire questionnaire = new Questionnaire();

        Answer answer4 = new Answer();
        answer4.setId("2"); //TutoringYears
        answer4.setValue(10);
        answer4.setMultiSelection(false);

        questionnaire.setAnswers(List.of(answer4));

        return questionnaire;
    }
}

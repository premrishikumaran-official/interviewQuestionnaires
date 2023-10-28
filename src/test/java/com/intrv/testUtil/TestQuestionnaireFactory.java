package com.intrv.testUtil;

import com.intrv.model.Answer;
import com.intrv.model.Questionnaire;
import com.intrv.model.multichoice.MultiSelectionChoice;
import com.intrv.model.multichoice.MultipleCategory;
import com.intrv.model.singlechoice.SingleCategory;
import com.intrv.model.singlechoice.SingleSelection;

import java.util.List;

public class TestQuestionnaireFactory {

    public static Questionnaire getQuestHomeAfterSclOnlineTutor2YearTutoring() {
        Questionnaire questionnaire = new Questionnaire();
        Answer answer = new Answer();

        MultiSelectionChoice afterSchoolClub = new MultiSelectionChoice("Q1a",true);
        MultiSelectionChoice homeSchooling = new MultiSelectionChoice("Q1b",true);
        MultiSelectionChoice onlineTutoring = new MultiSelectionChoice("Q1c",true);

        MultipleCategory multipleCategory = new MultipleCategory();
        multipleCategory.setCheckboxes(List.of(afterSchoolClub,homeSchooling,onlineTutoring));
        answer.setMultipleCategory(multipleCategory);


        SingleSelection yearsOfTraining = new SingleSelection("Q2",2);
        SingleCategory singleCategory = new SingleCategory();
        singleCategory.setSingleSelections(List.of(yearsOfTraining));
        answer.setSingleCategory(singleCategory);
        questionnaire.setAnswer(answer);

        return questionnaire;
    }


    public static Questionnaire getQuestHomeAfterSclOnlineTutor3YearTutoring() {
        Questionnaire questionnaire = new Questionnaire();
        Answer answer = new Answer();

        MultiSelectionChoice afterSchoolClub = new MultiSelectionChoice("Q1a",true);
        MultiSelectionChoice homeSchooling = new MultiSelectionChoice("Q1b",true);
        MultiSelectionChoice onlineTutoring = new MultiSelectionChoice("Q1c",true);

        MultipleCategory multipleCategory = new MultipleCategory();
        multipleCategory.setCheckboxes(List.of(afterSchoolClub,homeSchooling,onlineTutoring));
        answer.setMultipleCategory(multipleCategory);


        SingleSelection yearsOfTraining = new SingleSelection("Q2",3);
        SingleCategory singleCategory = new SingleCategory();
        singleCategory.setSingleSelections(List.of(yearsOfTraining));
        answer.setSingleCategory(singleCategory);
        questionnaire.setAnswer(answer);

        return questionnaire;
    }

    public static Questionnaire getQuestHomeAfterSclOnlineTutor10YearTutoring() {
        Questionnaire questionnaire = new Questionnaire();
        Answer answer = new Answer();

        MultiSelectionChoice afterSchoolClub = new MultiSelectionChoice("Q1a",true);
        MultiSelectionChoice homeSchooling = new MultiSelectionChoice("Q1b",true);
        MultiSelectionChoice onlineTutoring = new MultiSelectionChoice("Q1c",true);

        MultipleCategory multipleCategory = new MultipleCategory();
        multipleCategory.setCheckboxes(List.of(afterSchoolClub,homeSchooling,onlineTutoring));
        answer.setMultipleCategory(multipleCategory);


        SingleSelection yearsOfTraining = new SingleSelection("Q2",10);
        SingleCategory singleCategory = new SingleCategory();
        singleCategory.setSingleSelections(List.of(yearsOfTraining));
        answer.setSingleCategory(singleCategory);
        questionnaire.setAnswer(answer);

        return questionnaire;
    }

    public static Questionnaire getOnlyTutor10YearTutoring() {
        Questionnaire questionnaire = new Questionnaire();
        Answer answer = new Answer();

        MultipleCategory multipleCategory = new MultipleCategory();
        answer.setMultipleCategory(multipleCategory);


        SingleSelection yearsOfTraining = new SingleSelection("Q2",10);
        SingleCategory singleCategory = new SingleCategory();
        singleCategory.setSingleSelections(List.of(yearsOfTraining));
        answer.setSingleCategory(singleCategory);
        questionnaire.setAnswer(answer);

        return questionnaire;
    }
}

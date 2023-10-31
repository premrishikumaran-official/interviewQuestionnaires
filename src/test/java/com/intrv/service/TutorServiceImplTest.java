package com.intrv.service;

import com.intrv.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TutorServiceImplTest {
    private TutorServiceImpl tutorService;
    @BeforeEach
    void setUp() {
        tutorService= new  TutorServiceImpl();
    }

    @Test
    void WhenQuestionnaireHomeAfterSclOnlineTutor2YearTutoringSelected_thenCorrectScoreIsReturned (){
        TutorQuestionnaire questionnaire = new TutorQuestionnaire();
        questionnaire.setTutorId("tuto1");

        MultipleSelect multipleSelect = new MultipleSelect();
        multipleSelect.setHomeSchooling(new Option(true));
        multipleSelect.setAfterSchoolClub(new Option(true));
        multipleSelect.setOnlineTutoring(new Option(true));
        questionnaire.setMultipleSelect(multipleSelect);

        SingleSelect singleSelect = new SingleSelect(new TutoringExperience(2));
        questionnaire.setSingleSelect(singleSelect);

        int score = tutorService.calculateScore(questionnaire);
        assertEquals(4,score);
    }

    @Test
    void WhenQuestionnaireHomeAfterSclOnlineTutor3YearTutoringSelected_thenCorrectScoreIsReturned (){
        TutorQuestionnaire questionnaire = new TutorQuestionnaire();
        questionnaire.setTutorId("tuto1");

        MultipleSelect multipleSelect = new MultipleSelect();
        multipleSelect.setHomeSchooling(new Option(true));
        multipleSelect.setAfterSchoolClub(new Option(true));
        multipleSelect.setOnlineTutoring(new Option(true));
        questionnaire.setMultipleSelect(multipleSelect);

        SingleSelect singleSelect = new SingleSelect(new TutoringExperience(3));
        questionnaire.setSingleSelect(singleSelect);

        int score = tutorService.calculateScore(questionnaire);
        assertEquals(5,score);
    }


    @Test
    void WhenQuestionnaireHome3YearTutoringSelected_thenCorrectScoreIsReturned (){
        TutorQuestionnaire questionnaire = new TutorQuestionnaire();
        questionnaire.setTutorId("tuto1");

        MultipleSelect multipleSelect = new MultipleSelect();
        multipleSelect.setHomeSchooling(new Option(true));
        questionnaire.setMultipleSelect(multipleSelect);

        SingleSelect singleSelect = new SingleSelect(new TutoringExperience(3));
        questionnaire.setSingleSelect(singleSelect);

        int score = tutorService.calculateScore(questionnaire);
        assertEquals(3,score);
    }


    @Test
    void WhenOnly3YearTutoringSelected_thenCorrectScoreIsReturned (){
        TutorQuestionnaire questionnaire = new TutorQuestionnaire();
        questionnaire.setTutorId("tuto1");


        SingleSelect singleSelect = new SingleSelect(new TutoringExperience(3));
        questionnaire.setSingleSelect(singleSelect);

        int score = tutorService.calculateScore(questionnaire);
        assertEquals(2,score);
    }

    @Test
    void WhenQuestionnaireHomeAfterSclOnlineSelected_thenCorrectScoreIsReturned (){
        TutorQuestionnaire questionnaire = new TutorQuestionnaire();
        questionnaire.setTutorId("tuto1");

        MultipleSelect multipleSelect = new MultipleSelect();
        multipleSelect.setHomeSchooling(new Option(true));
        multipleSelect.setAfterSchoolClub(new Option(true));
        multipleSelect.setOnlineTutoring(new Option(true));
        questionnaire.setMultipleSelect(multipleSelect);


        int score = tutorService.calculateScore(questionnaire);
        assertEquals(3,score);
    }




}
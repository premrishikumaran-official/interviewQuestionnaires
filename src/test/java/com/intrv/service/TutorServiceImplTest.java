package com.intrv.service;

import com.intrv.model.Questionnaire;
import com.intrv.testUtil.TestQuestionnaireFactory;
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
       Questionnaire questionnaire =  TestQuestionnaireFactory.getQuestHomeAfterSclOnlineTutor2YearTutoring();
        int score = tutorService.calculateScore(questionnaire);
        assertEquals(4,score);
    }

    @Test
    void WhenQuestionnaireHomeAfterSclOnlineTutor3YearTutoringSelected_thenCorrectScoreIsReturned (){
        Questionnaire questionnaire =  TestQuestionnaireFactory.getQuestHomeAfterSclOnlineTutor3YearTutoring();
        int score = tutorService.calculateScore(questionnaire);
        assertEquals(5,score);
    }

    @Test
    void WhenQuestionnaireHomeAfterSclOnlineTutor10YearTutoringSelected_thenCorrectScoreIsReturned (){
        Questionnaire questionnaire =  TestQuestionnaireFactory.getQuestHomeAfterSclOnlineTutor10YearTutoring();
        int score = tutorService.calculateScore(questionnaire);
        assertEquals(5,score);
    }

    @Test
    void WhenQuestionnaireOnlyTutor10YearTutoringSelected_thenCorrectScoreIsReturned (){
        Questionnaire questionnaire =  TestQuestionnaireFactory.getOnlyTutor10YearTutoring();
        int score = tutorService.calculateScore(questionnaire);
        assertEquals(2,score);
    }



}
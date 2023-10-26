package com.intrv;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TutorQuestionnaireTest {

    @Test
    @DisplayName("WhenTutorSelectedAllChoice_thenScore will include all multiple choice")
    void testWhenTutorSelectedAllChoice_thenScoreWillReflect(){
     TutorQuestionnaire tutorQuestionnaire = new TutorQuestionnaire("tutor1");
     tutorQuestionnaire.setOnlineTutoring(true);
     tutorQuestionnaire.setAfterSchooling(true);
     tutorQuestionnaire.setHomeSchooling(true);
     assertEquals(3, tutorQuestionnaire.getScore());
    }

    @Test
    @DisplayName("WhenTutorInput Only experience _then Score will include only experience")
    void testWhenTutorSelectedYearsOfExp_thenScoreWillReflect(){
        TutorQuestionnaire tutorQuestionnaire = new TutorQuestionnaire("tutor1");
        tutorQuestionnaire.setTutorialExperience(10);
        assertEquals(2, tutorQuestionnaire.getScore());
    }

    @Test
    @DisplayName("WhenTutorInput both experience and multi choice " +
            " _then Score will include both")
    void testWhenTutorSelectedAppropriateQuestionnaire_thenScoreWillReflect(){
        TutorQuestionnaire tutorQuestionnaire = new TutorQuestionnaire("tutor1");
        tutorQuestionnaire.setOnlineTutoring(true);
        tutorQuestionnaire.setAfterSchooling(true);
        tutorQuestionnaire.setHomeSchooling(true);
        tutorQuestionnaire.setTutorialExperience(10);
        assertEquals(5, tutorQuestionnaire.getScore());
    }

    @Test
    @DisplayName("WhenTutor didnt input any choice " +
            " _then Score will be zero")
    void testWhenTutorSelectedNoQuestionnaire_thenScoreWillReflect(){
        TutorQuestionnaire tutorQuestionnaire = new TutorQuestionnaire("tutor1");
        assertEquals(0, tutorQuestionnaire.getScore());

    }


}

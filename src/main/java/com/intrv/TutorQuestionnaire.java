package com.intrv;

public class TutorQuestionnaire {
    String tutorId;

    private boolean onlineTutoring;
    private boolean homeSchooling;
    private boolean afterSchooling;

    private int tutorialExperience;

    private int score;

    public TutorQuestionnaire(String tutorId) {
        this.tutorId = tutorId;
    }

    public void setOnlineTutoring(boolean onlineTutoring) {
        this.onlineTutoring = onlineTutoring;
    }

    public void setHomeSchooling(boolean homeSchooling) {
        this.homeSchooling = homeSchooling;
    }

    public void setAfterSchooling(boolean afterSchooling) {
        this.afterSchooling = afterSchooling;
    }

    public void setTutorialExperience(int tutorialExperience) {
        this.tutorialExperience = tutorialExperience;
    }

    public int getScore() {
        score += onlineTutoring ? 1 : 0;
        score += homeSchooling ? 1 : 0;
        score += afterSchooling ? 1 : 0;

        if (tutorialExperience > 3) {
            score += 2;
        } else if (tutorialExperience > 1) {
            score += 1;
        }
        return score;
    }
}

package com.intrv.helper;

public class TutoringYearsScoreHelper implements ScoreHelper {
    private int value;

    @Override
    public ScoreHelper setValue(int val) {
        this.value = val;
        return this;
    }

    @Override
    public  int calculateScore(){
        int score =0;
        switch (value) {
            case 0,1 ->
                score += 0;
            case 2-> //1-2 years
                score += 1;
            default ->  score += 2;//3 or more
        }

        return score;
    }

}

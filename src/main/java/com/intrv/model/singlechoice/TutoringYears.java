package com.intrv.model.singlechoice;

public class TutoringYears implements SingleChoiceAnswer {

    private int value;

    public TutoringYears() {
    }

    public TutoringYears(int value) {
        this.value = value;
    }

    @Override
    public int getScore() {

        return calculateTutoringExpYears();
    }

    @Override
    public void setValue(int value) {
        this.value=value;
    }

    @Override
    public int getValue() {
        return value;
    }

    private int calculateTutoringExpYears(){
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

package com.intrv.singlechoice;

public class TutoringYears implements SingleChoiceAnswer {
    int years;

    public TutoringYears(int years) {
        this.years = years;
    }

    @Override
    public int getScore() {
        return calculateTutoringExpYears();
    }

    private int calculateTutoringExpYears(){
        int score =0;
        switch (years) {
            case 2: //1-2 years
                score += 1;
                break;
            case 3: //3 or more
                score += 2;
                break;
            default: //everything else
                score += 0;
        }

        return score;
    }
}
